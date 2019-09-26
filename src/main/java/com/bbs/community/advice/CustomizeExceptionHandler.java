package com.bbs.community.advice;

import com.bbs.community.exception.CustomizeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Parcol
 * @date 2019/9/25
 **/
@ControllerAdvice
public class CustomizeExceptionHandler {
    @ExceptionHandler(Exception.class)
    ModelAndView handle(Throwable e, Model model) {
        if(e instanceof CustomizeException){
            model.addAttribute("message",e.getMessage());
        }else{
            model.addAttribute("message","服务器冒烟了,要不然你稍后再试!");
        }
        return new ModelAndView("error" );
    }
}
