package com.demo.bean;

import java.sql.Date;

import javax.persistence.Column;

import org.springframework.format.annotation.DateTimeFormat;

public class CustRequest {

	private String custId;
	private String password;
	private String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birth;
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
}
