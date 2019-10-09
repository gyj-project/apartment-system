package cn.bzu.loginprovider.controller;


import cn.bzu.loginprovider.pojo.Admin;
import cn.bzu.loginprovider.pojo.LoginInfo;
import cn.bzu.loginprovider.pojo.Msg;
import cn.bzu.loginprovider.service.AdminService;
import cn.bzu.loginprovider.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
@RestController
public class LoginController {
    @Resource
    AdminService adminService;

    @Resource
    EmployeeService employeeService;

    // 登录
    @PostMapping("/login")
    public Msg login(@RequestBody LoginInfo info){

        String name = info.getName();
        String pass = info.getPass();

        // 判断身份做出回应
        if (adminService.adminLogin(name, pass)){
            return Msg.success().add("people", "admin");
        }
        else if (employeeService.empLogin(name, pass)){
            return Msg.success().add("people", "emp");
        }
        else {
            return Msg.fail();
        }
    }

    // 找回密码
    @PostMapping("/findPass")
    public Msg findPass(@RequestBody Admin admin){

         return adminService.getPass(admin.getAdminName(), admin.getAdminEmail()) == true ? Msg.success() : Msg.fail();

    }

}

