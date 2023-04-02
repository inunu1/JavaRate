package com.Inunu1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class testController {

    @GetMapping("/hello")
    public String hello() {
        return "test";
    }
}