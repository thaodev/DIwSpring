package com.example.diwspring.controllers;

import com.example.diwspring.services.BusinessService;

public class PropertyInjectedController {

    public BusinessService businessService;

    public String greeting() {
       return businessService.sayGreeting();
    }
}
