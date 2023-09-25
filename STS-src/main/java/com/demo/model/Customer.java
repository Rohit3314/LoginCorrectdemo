package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer
{

	@Id
	private int cid;
	private String cname;
	private int camount;
	
	public Customer() 
	{
		super();
	}

	public Customer(int cid, String cname, int camount) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.camount = camount;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCamount() {
		return camount;
	}

	public void setCamount(int camount) {
		this.camount = camount;
	}
	
	
	
}
