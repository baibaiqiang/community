package com.bbs.community.controller;

import com.bbs.community.dto.PaginationDTO;
import com.bbs.community.dto.QuestionDTO;
import com.bbs.community.mapper.QuestionMapper;
import com.bbs.community.mapper.UserMapper;
import com.bbs.community.model.Question;
import com.bbs.community.model.User;
import com.bbs.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Creat  on 2019/9/2.
 * @author Parcol
 */
@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name="page",defaultValue = "1") Integer page,
                        @RequestParam(name="size",defaultValue = "3") Integer size){
        Cookie[] cookies = request.getCookies();
        if(null != cookies && 0 != cookies.length){
            for (Cookie cookie : cookies) {
                //if(cookie.getName().equals("token")){
                if("token".equals(cookie.getName())){
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if(user !=null){
                        request.getSession().setAttribute("user",user);
                    }
                    break;
                }
            }
        }
        PaginationDTO pagination = questionService.list(page,size);
        model.addAttribute("pagination",pagination);
        return "index";
    }
}
