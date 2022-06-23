package com.example.diwspring.controllers;

import com.example.diwspring.services.BusinessService;

public class ConstructorInjectedController {

    private BusinessService businessService;

    public ConstructorInjectedController(BusinessService businessService) {
        this.businessService = businessService;
    }

    public String greeting() {
       return businessService.sayGreeting();
    }


}
