package com.mrathena.tutorial.spring4.chapter3.conditional;

public class WindowsListServiceImpl implements ListService {

	@Override
	public String showListCmd() {
		return "dir";
	}

}