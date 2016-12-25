package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.spring.bean.User;

public interface UserMapper {
	final String SQL_GET_USER_LIST = "SELECT * FROM USER";

	@Select(SQL_GET_USER_LIST)
	@Results(value = { @Result(property = "user_id", column = "user_id"),
			@Result(property = "email_id", column = "email_id"), @Result(property = "password", column = "password"),
			@Result(property = "first_name", column = "first_name"),
			@Result(property = "last_name", column = "last_name") })
	List<User> getUserList();
}
