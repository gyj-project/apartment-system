package cn.bzu.fixprovider.controller;


import cn.bzu.fixprovider.pojo.Application;
import cn.bzu.fixprovider.pojo.Msg;
import cn.bzu.fixprovider.service.ApplicationService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

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
    ApplicationService applicationService;

    /*
     * 分页查询申请信息*/
    @GetMapping("/apps")
    public Msg getApps(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageMethod.startPage(pn,8);
        List<Application> list = applicationService.selectApps();
        PageInfo pageInfo = new PageInfo(list,6);
        return Msg.success().add("pageInfo", pageInfo);

    }

    // 根据id查询请求
    @GetMapping("/app/{id}")
    public Msg getApp(@PathVariable("id") Integer id) {
        Application application = applicationService.selectAppById(id);
        return Msg.success().add("appInfo", application);
    }

    // 设置已读
    @GetMapping("/app")
    public  Msg updateEmp(@RequestParam("id") Integer id)  {
        applicationService.updateAppSetIfRead(id);
        return Msg.success();
    }

}

