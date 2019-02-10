package com.praktikum.praktikum01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping ("/")
    public String index() {
        return "Hello World!";

    }
}
