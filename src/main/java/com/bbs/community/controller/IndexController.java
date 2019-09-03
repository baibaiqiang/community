package com.bbs.community.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Creat  on 2019/9/2.
 * @author Parcol
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String hello(){
        return "index";
    }
}
