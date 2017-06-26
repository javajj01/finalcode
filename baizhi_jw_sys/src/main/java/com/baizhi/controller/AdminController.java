package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import com.baizhi.vo.Choose;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by asus on 2017/6/12.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @RequestMapping("/login")
    @ResponseBody
    public Choose login(Admin admin){
        Subject subject = SecurityUtils.getSubject();
        Choose choose = new Choose();
        try {
            subject.login(new UsernamePasswordToken(admin.getAdminname(),admin.getPassword()));
            choose.setTemp(true);
        } catch (UnknownAccountException e) {
            System.out.println("用户名错误");
            choose.setTemp(false);
        }catch (IncorrectCredentialsException e){
            System.out.println("密码错误");
            choose.setTemp(false);
        }
        return choose;
    }
}
