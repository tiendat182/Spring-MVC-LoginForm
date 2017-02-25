package com.spring.controller;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.bean.Account;
import com.spring.common.Connection;
import com.spring.mapper.AccountMapper;

@Controller
public class LoginController {

	/*
	 * ========================================================================
	 * Constants
	 * ========================================================================
	 */
	/** Path to file connection DataBase */
	private static final String RESOURCE_PATH = "com/spring/config/mybatis-config.xml";

	/*
	 * ========================================================================
	 * RequestMapping
	 * ========================================================================
	 */

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean) throws IOException {
		if (loginBean != null && loginBean.getUserName() != null && loginBean.getPassword() != null) {
			SqlSession sqlSession = Connection.sqlSession(RESOURCE_PATH);
			AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
			// Set parameters to Account
			Account inputAccount = new Account();
			inputAccount.setUserName(loginBean.getUserName());
			inputAccount.setPassword(loginBean.getPassword());

			Account rs_account = accountMapper.getAccount(inputAccount);

			if (rs_account != null) {
				model.addAttribute("msg", "Welcome " + loginBean.getUserName());
				sqlSession.close();
				return "success";
			} else {
				model.addAttribute("error", "Invalid username and password");
				sqlSession.close();
				return "login";
			}
		} else {
			model.addAttribute("error", "Please enter username and password.");
			return "login";
		}
	}

	/*
	 * ========================================================================
	 * private method
	 * ========================================================================
	 */
}
