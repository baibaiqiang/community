package com.bbs.community.controller;

import com.bbs.community.dto.PaginationDTO;
import com.bbs.community.mapper.UserMapper;
import com.bbs.community.model.User;
import com.bbs.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Parcol
 * @date 2019/9/20
 **/
@Controller
public class ProfileController {
    @Autowired
    private QuestionService questionService;
    @GetMapping("/profile/{action}")
    public String profile(@PathVariable(name = "action") String action,
                          @RequestParam(name="page",defaultValue = "1") Integer page,
                          @RequestParam(name ="size",defaultValue = "3") Integer size,
                          HttpServletRequest request,
                          Model model){
        if("questions".equals(action)){
            model.addAttribute("section","questions");
            model.addAttribute("sectionName","我的问题");
        } else if ("replies".equals(action)) {
            model.addAttribute("section","replies");
            model.addAttribute("sectionName","最新回复");
        }
        User user = (User)request.getSession().getAttribute("user");
        if(user == null){
            return "redirect:/";
        }
        PaginationDTO paginationDTO = new PaginationDTO();
        paginationDTO = questionService.listByUserId(user.getId(),page,size);
        model.addAttribute("pagination",paginationDTO);
        return "profile";
    }
}
