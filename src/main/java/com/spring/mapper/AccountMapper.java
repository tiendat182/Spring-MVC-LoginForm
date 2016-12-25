package com.spring.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.spring.bean.Account;

public interface AccountMapper {
	final String SQL_GET_ACCOUNT_LOGIN = "SELECT ID FROM ACCOUNT WHERE USERNAME = #{username} AND PASSWORD = #{password} AND DEL_FLG = '0'";

	@Select(SQL_GET_ACCOUNT_LOGIN)
	@Results(value = { @Result(property = "id", column = "ID") })
	Account getAccount(Account account);
}
