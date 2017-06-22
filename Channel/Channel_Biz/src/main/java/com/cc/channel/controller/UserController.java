package com.cc.channel.controller;

import com.cc.channel.entities.User;
import com.cc.channel.service.UserService;
import com.cc.channel.util.GlobalMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author changcheng
 * @version 2017/6/9
 * @description
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/regist")
    public String regist() {
        //select
        //insert
        return "/error";
    }

    @RequestMapping("/user/login")
    public String login(User user, HttpSession session) {
        session.setAttribute(GlobalMessage.LOGIN_USER, userService.login(user));
        return "redirect:/index.jsp";
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/index.jsp";
    }

    public void deleteAccount() {
        //delete
    }

    public void findAccountByPhoneNum() {
        //select
    }

    public void findAccountByEmail() {
        //select
    }
}
