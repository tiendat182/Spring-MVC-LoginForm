package com.spring.controller;

public class UserBean {
	private int user_id;
	private String email_id;
	private String password;
	private String first_name;
	private String last_name;
	private String status;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("user_id=").append(user_id).append(" - ");
		sb.append("email_id=").append(email_id).append(" - ");
		sb.append("password=").append(password).append(" - ");
		sb.append("first_name=").append(first_name).append(" - ");
		sb.append("last_name=").append(last_name).append(" - ");
		sb.append("status=").append(status);
		return sb.toString();
	}
}
