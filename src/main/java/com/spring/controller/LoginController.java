package com.spring.controller;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.bean.Account;
import com.spring.mapper.AccountMapper;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean) throws IOException {
		if (loginBean != null && loginBean.getUserName() != null && loginBean.getPassword() != null) {
			Reader reader = Resources.getResourceAsReader("com/spring/config/mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
			Account inputAccount = new Account();
			inputAccount.setUserName(loginBean.getUserName());
			inputAccount.setPassword(loginBean.getPassword());

			Account rs_account = accountMapper.getAccount(inputAccount);

			if (rs_account != null) {
				model.addAttribute("msg", "Welcome " + loginBean.getUserName());

				// Get user list
				// userList = getUserList(sqlSession);
				// for (User user : userList) {
				// System.out.println(user.toString());
				// }
				//
				// model.addAttribute("userList", userList);
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

		// if (loginBean != null && loginBean.getUserName() != null &
		// loginBean.getPassword() != null) {
		// if (loginBean.getUserName().equals("chandra") &&
		// loginBean.getPassword().equals("chandra123")) {
		// model.addAttribute("msg", "welcome" + loginBean.getUserName());
		// return "success";
		// } else {
		// model.addAttribute("error", "Invalid Details");
		// return "login";
		// }
		// } else {
		// model.addAttribute("error", "Please enter Details");
		// return "login";
		// }
	}

	/*
	 * ========================================================================
	 * private method
	 * ========================================================================
	 */
}
