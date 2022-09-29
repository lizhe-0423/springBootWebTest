package com.example.controller;

import com.example.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 爱编程的小阿哲
 * @version 我亦无他, 惟手熟尔
 * @description: TODO
 * @date 2022/9/28 12:33
 */
@Slf4j
@Controller
public class MainController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        //这里就用Session代替ID吧
        MDC.put("reqId", request.getSession().getId());
        log.info("用户访问了一次登陆界面");
        return "login";
    }
}