package com.example.firstPrjt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SmapleController {
    
    @GetMapping("/")
    public String sampleController() {

        return "hello1";
    }
}
