package com.cc.channel.controller;

import com.cc.channel.entities.User;
import com.cc.channel.service.ProductService;
import com.cc.channel.service.SecondKillService;
import com.cc.channel.util.GlobalMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author changcheng
 * @version 2017/6/13
 * @description
 */
@Controller
public class SecondKillController {

    @Autowired
    SecondKillService secondKillService;
    @Autowired
    ProductService productService;
    @RequestMapping("/biz/initSecondView")
    public String initSecondKill(ServletRequest req) {
        //查询商品个数
        int amount=productService.countProductByName("testproduct");
        req.setAttribute(GlobalMessage.PRODUCT_AMOUNT,amount);
        //抢购时间
        req.setAttribute("beginTime", 10);
        req.setAttribute("leftTime", 10);
        //抢购剩余时间
        return "/pages/biz/secondview";
    }

    @RequestMapping("/biz/secondkill")
    public String secondKill() {
        //验证用户是否登录
        //未登录抛个异常出去
        //已登录进行秒杀Service

        return "/pages/cart/checkout.jsp";
    }
}
