package com.bbs.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Create by  Parcol on 2019-9-10
 * @author Parcol
 */
@Controller
public class PublishController {
    @GetMapping("/publish")
    public String publish()
    {
        return "publish";
    }
}
