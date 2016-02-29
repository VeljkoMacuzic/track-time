package com.vmac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Veljko on 1.3.2016..
 */
@Controller
public class Home {
    String username = "Veljko";
    String password = "testPass";


    @RequestMapping
    public ModelAndView showMessage() {
        System.out.println("from Controller");
        return new ModelAndView("hello", "username", username);
    }
}
