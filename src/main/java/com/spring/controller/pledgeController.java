package com.spring.controller;

import com.spring.bean.Account;
import com.spring.bean.LoginBean;
import com.spring.common.Connection;
import com.spring.mapper.AccountMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@Controller
public class pledgeController {

	/*
	 * ========================================================================
	 * Constants dat
	 * ========================================================================
	 */
	/** Attribute name msg */
	private static final String ATTRIBUTE_NAME_MSG = "msg";
	/** Attribute name error */
	private static final String ATTRIBUTE_NAME_ERROR = "error";
	/** Attribute value Login detail */
	private static final String ATTRIBUTE_VAL_MSG_LOGIN_DETAIL = "Please Enter Your Login Details";
	/** Attribute value invalid user name and password */
	private static final String ATTRIBUTE_VAL_INVALID = "Invalid username and password";
	/** Attribute value enter user name and password */
	private static final String ATTRIBUTE_VAL_ENTER_USR_PWD = "Please enter username and password.";
	/** Path to file connection DataBase */
	private static final String RESOURCE_PATH = "com/spring/config/mybatis-config.xml";

	/*
	 * ========================================================================
	 * RequestMapping
	 * ========================================================================
	 */

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute(ATTRIBUTE_NAME_MSG, ATTRIBUTE_VAL_MSG_LOGIN_DETAIL);
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
				model.addAttribute(ATTRIBUTE_NAME_MSG, "Welcome " + loginBean.getUserName());
				sqlSession.close();
				return "success";
			} else {
				model.addAttribute(ATTRIBUTE_NAME_ERROR, ATTRIBUTE_VAL_INVALID);
				sqlSession.close();
				return "login";
			}
		} else {
			model.addAttribute(ATTRIBUTE_NAME_ERROR, ATTRIBUTE_VAL_ENTER_USR_PWD);
			return "login";
		}
	}

	/*
	 * ========================================================================
	 * private method
	 * ========================================================================
	 */
}
