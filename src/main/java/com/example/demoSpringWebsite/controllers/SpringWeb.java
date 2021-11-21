package com.example.demoSpringWebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringWeb {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
        public String index(){
            return "index";
    }
    @RequestMapping(value = "/aboutus", method = RequestMethod.GET)
    public String aboutus(){
        return "aboutus";
    }
    @RequestMapping(value = "/contactus", method = RequestMethod.GET)
    public String contactus(){
        return "contactus";
    }

}
