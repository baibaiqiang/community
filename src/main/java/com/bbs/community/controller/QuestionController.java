package com.bbs.community.controller;

import com.bbs.community.dto.QuestionDTO;
import com.bbs.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Parcol
 * @date 2019/9/23
 **/
@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Integer id,
                           Model model){
        QuestionDTO question = questionService.getById(id);
        questionService.incView(id);
        model.addAttribute("question",question);
        return "question";
    }
}
