package com.example.diwspring.controllers;

import com.example.diwspring.services.BusinessServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new BusinessServiceImpl());
    }

    @Test
    void greeting() {

        System.out.println(controller.greeting());
    }
}