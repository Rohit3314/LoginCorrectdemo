package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login 
{
	@Id
	private String uid;
	private String upswd;
	
	public Login() {
		super();
		
	}

	public Login(String uid, String upswd) {
		super();
		this.uid = uid;
		this.upswd = upswd;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpswd() {
		return upswd;
	}

	public void setUpswd(String upswd) {
		this.upswd = upswd;
	}
	
	

}
