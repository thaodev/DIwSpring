package com.example.diwspring.controllers;

import com.example.diwspring.services.BusinessServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.businessService = new BusinessServiceImpl();
    }

    @Test
    void greeting() {
        System.out.print(controller.greeting());
    }
}