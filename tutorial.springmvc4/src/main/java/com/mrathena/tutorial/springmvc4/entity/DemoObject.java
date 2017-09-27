package com.mrathena.tutorial.springmvc4.entity;

public class DemoObject {

	private Integer id;
	private String username;

	public DemoObject() {
		super();
	}

	public DemoObject(Integer id, String username) {
		super();
		this.id = id;
		this.username = username;
	}

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

	@Override
	public String toString() {
		return "DemoObject [id=" + id + ", username=" + username + "]";
	}

}