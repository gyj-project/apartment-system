package cn.bzu.manageconsumer.controller;



import cn.bzu.manageconsumer.pojo.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
@RestController
public class ApplicationController {


    @Resource
    public RestTemplate restTemplate;


    // 分页查询维修请求信息
    @GetMapping("/apps")
    public Msg getApps(@RequestParam(value="pn",defaultValue="1") Integer pn){
        Msg msg = restTemplate.getForObject("http://FIX-PROVIDER/apps?pn="+pn, Msg.class);
        return msg;
    }

    // 通过id查询请求
    @GetMapping("/app/{id}")
    public Msg getAppById(@PathVariable("id") Integer id) {
        Msg msg = restTemplate.getForObject("http://FIX-PROVIDER/app/"+id, Msg.class);
        return msg;
    }

    //通过id修改请求为已读
    @GetMapping("/app")
    public Msg updateApp(@RequestParam("id") Integer id){
        Msg msg = restTemplate.getForObject("http://FIX-PROVIDER/app?id=" + id, Msg.class);
        return msg;

    }

}

