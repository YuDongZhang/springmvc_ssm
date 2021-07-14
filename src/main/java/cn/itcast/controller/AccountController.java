package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户web
 */
@Controller()
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("/findAll")
    public String findAll() {
        System.out.println("表现层查询所有信息 AccountController.findAll()执行了...");
        return "list";
    }
}
