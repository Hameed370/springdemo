package com.niit.models;

public class User {
	private String userid,email,password,contact;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public User(String userid, String email, String password, String contact) {
		
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.contact = contact;
	}
	

	@Override
	public String toString() {
		return "User [userid=" + userid + ", email=" + email + ", password=" + password + ", contact=" + contact + "]";
	}

	public User() {
		
	}
	
}
