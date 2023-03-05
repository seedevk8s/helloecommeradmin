package kr.co.ezenac.helloecommeradmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "/hello-page";
    }
}
