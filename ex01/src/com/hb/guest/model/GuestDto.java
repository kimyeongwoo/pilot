package com.hb.guest.model;

import java.util.Date;

public class GuestDto {//이건 hashmap 을 대신하여 넣는 것이다

	private int sabun;
	private String name;
	private Date nalja;
	private int pay;

	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getNalja() {
		return nalja;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}

	
}
