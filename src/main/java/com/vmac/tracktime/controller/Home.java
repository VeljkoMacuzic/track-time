package com.vmac.tracktime.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vmac.tracktime.LoginService;


/**
 * Created by Veljko on 1.3.2016..
 */

/*@Configuration
@ComponentScan*/
@Controller
@RequestMapping("/login")
public class Home {
   
	/*private LoginService loginService;
	
	public void setLoginService(LoginService loginService) {
		System.out.println("Setting login service: " + loginService);
		this.loginService = loginService;
	}
	
	String username = loginService.getUsername();*/
	
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showMessage() {
        System.out.println("from Controller");
        return new ModelAndView("login", "username", username);
    }
}
