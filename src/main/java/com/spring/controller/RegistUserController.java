package com.spring.controller;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.bean.User;
import com.spring.mapper.UserMapper;

@Controller
public class RegistUserController {
	private List<User> userList = null;

	/*
	 * Get user list
	 */
	@RequestMapping(value = "/registUser/getUserList")
	public String getUserList(Model model) {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("com/spring/config/mybatis-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		userList = userMapper.getUserList();
		model.addAttribute("userList", userList);
		sqlSession.close();

		return "listUser";
	}

	/*
	 * Register user
	 */
	@RequestMapping(value = "/registUser/regist", method = RequestMethod.POST)
	public String regist(Model model, @ModelAttribute("userBean") UserBean userBean) {
		System.out.println(userBean.toString());
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("com/spring/config/mybatis-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		// Copy data from userBean to user class
		User user = new User();
		user.setEmail_id(userBean.getEmail_id());
		user.setPassword(userBean.getPassword());
		user.setFirst_name(userBean.getFirst_name());
		user.setLast_name(userBean.getLast_name());
		System.out.println("USER : " + user.toString());
		// Insert
		userMapper.insert(user);
		sqlSession.commit();
		sqlSession.close();
		// Get list of user
		getUserList(model);
		return "listUser";
	}
}