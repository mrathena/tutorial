package com.mrathena.tutorial.spring4.chapter3.conditional;

public class LinuxListServiceImpl implements ListService {

	@Override
	public String showListCmd() {
		return "ll";
	}

}