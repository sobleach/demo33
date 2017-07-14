package com.controller;

import com.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Thum on 7/14/2017 AD.
 */

@RestController
public class HomeController {

    /*Property base Injection : hard debug*/
    /*@Autowired*/
    HomeService service;

    /*Constructor base Injection*/
    @Autowired
    public HomeController(HomeService service) {
        this.service = service;
    }

    /*Setter base Injection*/
    /*@Autowired
    public void setService(HomeService service) {
        this.service = service;
    }*/

    /*this value is reference from application.properties file*/
    @Value("${app.comming}")
    private String comming;

    @RequestMapping("/")
    public String home(){
        return comming;
    }

    @RequestMapping("/service")
    public String callService(){
        return service.doService();
    }

}
