package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户web
 */
@Controller()
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层查询所有信息 AccountController.findAll()执行了...");
        //调用 service 的方法(这里要有service对象 , 从而要注入service对象)
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层保存账户 AccountController.save执行了...");
        accountService.saveAccount(account);
        //请求转发到上一个路径,(注意不是直接调用上面的一个方法)
        response.sendRedirect(request.getContextPath() + "/account/findAll");
        return;
    }
}
