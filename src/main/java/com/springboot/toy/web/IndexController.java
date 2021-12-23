package com.springboot.toy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    //index를 반환하므로 index.mustache로 전환되어 View Resolver 가 처리하게 된다.
    public String index(){
        return "index";
    }
}
