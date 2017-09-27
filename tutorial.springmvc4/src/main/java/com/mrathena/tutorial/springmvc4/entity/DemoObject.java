package com.mrathena.tutorial.springmvc4.entity;

public class DemoObject {

	private Integer id;
	private String username;
	private boolean isMale;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	@Override
	public String toString() {
		return "DemoObject [id=" + id + ", username=" + username + ", isMale=" + isMale + "]";
	}

}