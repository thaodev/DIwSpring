package com.example.diwspring.controllers;

import com.example.diwspring.services.BusinessService;

public class SetterInjectedController {
    private BusinessService businessService;

    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
    }

    public String greeting(){
        return businessService.sayGreeting();
    }
}
