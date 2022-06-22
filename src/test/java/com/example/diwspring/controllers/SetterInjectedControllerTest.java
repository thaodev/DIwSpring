package com.example.diwspring.controllers;

import com.example.diwspring.services.BusinessServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setBusinessService(new BusinessServiceImpl());
    }

    @Test
    void greeting() {
        System.out.println(controller.greeting());
    }
}