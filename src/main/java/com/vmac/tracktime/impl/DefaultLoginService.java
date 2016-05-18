package com.vmac.tracktime.impl;

import org.springframework.stereotype.Component;

import com.vmac.tracktime.LoginService;

@Component(value = "loginService")
public class DefaultLoginService implements LoginService{

	public DefaultLoginService() {
		System.out.println("Creating DefaultLoginService: " + this);
	}
	
	@Override
	public String getUsername() {
		return "Dylan";
	}
	
}
