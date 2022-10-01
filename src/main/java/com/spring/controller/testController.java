package com.spring.controller;

import com.spring.bean.User;
import com.spring.bean.UserBean;
import com.spring.common.Connection;
import com.spring.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * Function register user information
 * @author DatLT
 *
 */
@Controller
public class testController {
	private List<User> userList = null;
	/*
	 * ========================================================================
	 * Constants
	 * ========================================================================
	 */
	/** Length of email*/
	private static final int LEN_EMAIL_USER = 45; 
	/** Length of password*/
	private static final int LEN_PASSWORD_USER = 45; 
	/** Length of first name*/
	private static final int LEN_FIRST_NAME_USER = 45; 	
	/** Error message when password is empty */
	private static final String PASSWORD_NOT_EMPTY = "Password is NOT empty"; 
	/** Error message when email is empty */
	private static final String EMAIL_NOT_EMPTY = "Email is NOT empty"; 
	/** Error message when first_name is empty */
	private static final String FIRST_NAME_NOT_EMPTY = "First name is NOT empty"; 
	/** Error message when email is greater than 45 characters */
	private static final String EMAIL_TOO_LONG = "Email is too long.Plz enter email is 45 chacracters"; 
	/** Error message when password is greater than 45 characters */
	private static final String PASSWORD_TOO_LONG = "Password is too long.Plz enter password is 45 chacracters"; 	
	/** Error message when first name is greater than 45 characters */
	private static final String FIRST_NAME_TOO_LONG = "First name is too long.Plz enter first name is 45 chacracters"; 		
	/** Resource path */
	private static final String RESOURCE_PATH = "com/spring/config/mybatis-config.xml";

	/*
	 * ========================================================================
	 * RequestMapping
	 * ========================================================================
	 */

	/**
	 * Get user list to display
	 * 
	 * @param model
	 * @return list of screen
	 * @throws IOException
	 */
	@RequestMapping(value = "/registUser/getUserList")
	public String getUserList(Model model) throws IOException {
		SqlSession sqlSession = Connection.sqlSession(RESOURCE_PATH);
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		userList = userMapper.getUserList();
		model.addAttribute("userList", userList);
		sqlSession.close();

		return "listUser";
	}

	/**
	 * Register user
	 * 
	 * @param model
	 * @param userBean
	 * @return json: <b>TRUE</b> if has error, otherwise is <b>FALSE</b>
	 */
	@RequestMapping(value = "/registUser/regist", method = RequestMethod.POST)
	@ResponseBody
	public String regist(Model model, @ModelAttribute("userBean") UserBean userBean) {
		JSONObject jsonResponse = new JSONObject();
		try {
			System.out.println("=======> " + userBean.toString());
			// Validate input
			if (validateForRegist(jsonResponse, userBean)) {
				jsonResponse.put("hasError", "true");
				return jsonResponse.toString();
			}
			if (checkExistEmail(jsonResponse, userBean)) {
				jsonResponse.put("hasError", "true");
				return jsonResponse.toString();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Register user
		try {
			// reader =
			// Resources.getResourceAsReader("com/spring/config/mybatis-config.xml");
			//
			// SqlSessionFactory sqlSessionFactory = new
			// SqlSessionFactoryBuilder().build(reader);
			// SqlSession sqlSession = sqlSessionFactory.openSession();
			// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			// // // Copy data from userBean to user class
			// User user = new User();
			// user.setEmail_id(userBean.getEmail_id());
			// user.setPassword(userBean.getPassword());
			// user.setFirst_name(userBean.getFirst_name());
			// user.setLast_name(userBean.getLast_name());
			// System.out.println("USER : " + user.toString());
			// Insert
			// userMapper.insert(user);
			// sqlSession.commit();
			// sqlSession.close();
			jsonResponse.put("hasError", "false");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonResponse.toString();
	}

	/*
	 * =========================================================================
	 * private method
	 * =========================================================================
	 */

	/**
	 * Validate input items : 
	 * 	<ul>
	 * 		<li>validateEmailId</li>
	 * 		<li>validatePassword</li>
	 * 		<li>validateFirstName</li>
	 * 	</ul>
	 * @param jsonResponse store key for error message
	 * @param userBean properties input
	 * @return <b>TRUE</b> if has error, otherwise is <b>FALSE</b>
	 */
	private boolean validateForRegist(JSONObject jsonResponse, UserBean userBean) throws JSONException {
		boolean hasError = false;
		if (validateEmailId(jsonResponse, userBean)) {
			hasError = true;
		}
		if (validatePassword(jsonResponse, userBean)) {
			hasError = true;
		}
		if (validateFirstName(jsonResponse, userBean)) {
			hasError = true;
		}
		return hasError;
	}
	
	/**
	 * Validate email item : 
	 * 	<ul>
	 * 		<li>Check empty</li>
	 * 		<li>Check max length</li>
	 * 	</ul>
	 * @param jsonResponse store key for error message
	 * @param userBean properties input
	 * @return <b>TRUE</b> if has error, otherwise is <b>FALSE</b>
	 * @throws JSONException 
	 */
	private boolean validateEmailId(JSONObject jsonResponse, UserBean userBean) throws JSONException {
		userBean.setEmail_id(userBean.getEmail_id().trim());
		// Check empty
		if (StringUtils.isEmpty(userBean.getEmail_id())) {
			jsonResponse.put("emailError", EMAIL_NOT_EMPTY);
			return true;
		}
		// Check max length
		if (userBean.getEmail_id().length() > LEN_EMAIL_USER) {
			jsonResponse.put("emailError", EMAIL_TOO_LONG);
			return true;
		}
		return false;
	}
	
	/**
	 * Validate password item :
	 * 	<ul>
	 * 		<li>Check empty</li>
	 * 		<li>Check max length</li>
	 * 	</ul>
	 * @param jsonResponse store key for error message
	 * @param userBean properties input
	 * @return <b>TRUE</b> if has error, otherwise is <b>FALSE</b>
	 * @throws JSONException 
	 */
	private boolean validatePassword(JSONObject jsonResponse, UserBean userBean) throws JSONException {
		userBean.setPassword(userBean.getPassword().trim());
		// Check empty
		if (StringUtils.isEmpty(userBean.getPassword())) {
			jsonResponse.put("passwordError", PASSWORD_NOT_EMPTY);
			return true;
		}
		// Check max length
		if (userBean.getPassword().length() > LEN_PASSWORD_USER) {
			jsonResponse.put("passwordError", PASSWORD_TOO_LONG);
			return true;
		}
		return false;
	}
	
	/**
	 * Validate first name item
	 * 	<ul>
	 * 		<li>Check empty</li>
	 * 		<li>Check max length</li>
	 * 	</ul>
	 * @param jsonResponse store key for error message
	 * @param userBean properties input
	 * @return <b>TRUE</b> if has error, otherwise is <b>FALSE</b>
	 * @throws JSONException 
	 */
	private boolean validateFirstName(JSONObject jsonResponse, UserBean userBean) throws JSONException {
		userBean.setFirst_name(userBean.getFirst_name().trim());
		// Check empty
		if (StringUtils.isEmpty(userBean.getFirst_name())) {
			jsonResponse.put("firstNameError", FIRST_NAME_NOT_EMPTY);
			return true;
		}
		// Check max length
		if (userBean.getFirst_name().length() > LEN_FIRST_NAME_USER) {
			jsonResponse.put("firstNameError", FIRST_NAME_TOO_LONG);
			return true;
		}
		return false;
	}

	/**
	 * Check existence of email
	 * @param jsonResponse store key for error message
	 * @param userBean properties input
	 * @return <b>TRUE</b> if existed, otherwise is <b>FALSE</b>
	 * @throws JSONException 
	 */
	private boolean checkExistEmail(JSONObject jsonResponse, UserBean userBean) throws JSONException {

		return false;
	}
}
