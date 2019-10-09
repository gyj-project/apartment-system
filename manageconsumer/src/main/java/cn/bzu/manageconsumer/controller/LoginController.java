package cn.bzu.manageconsumer.controller;

import cn.bzu.manageconsumer.pojo.Admin;
import cn.bzu.manageconsumer.pojo.Employee;
import cn.bzu.manageconsumer.pojo.LoginInfo;
import cn.bzu.manageconsumer.pojo.Msg;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    RestTemplate restTemplate;


    // 登录
    @PostMapping("/login")
    public Msg login(@RequestBody LoginInfo info){

        Msg msg = restTemplate.postForObject("http://LOGIN-PROVIDER/login", info, Msg.class);
        return msg;

    }

    // 密码找回
    @PostMapping("/findPass")
    public Msg findPass(@RequestBody Admin admin){
        System.out.println(admin.getAdminName());
        Msg msg = restTemplate.postForObject("http://LOGIN-PROVIDER/findPass", admin, Msg.class);
        System.out.println(msg.getCode());
        return msg;

    }


}
