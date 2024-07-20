package com.qiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Q
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "Hello World";
    }
}
