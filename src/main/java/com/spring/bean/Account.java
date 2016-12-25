package com.spring.bean;

public class Account {
	// Column id
	private int id;
	// Column username
	private String username;
	// Column password
	private String password;
	// Column del_Flg
	private String delFlg;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id = ").append(id).append(" - ");
		sb.append("userName = ").append(username).append(" - ");
		sb.append("password = ").append(password).append(" - ");
		sb.append("delFlg = ").append(delFlg);

		return sb.toString();
	}
}
