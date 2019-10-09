package cn.bzu.fixprovider.controller;


import cn.bzu.fixprovider.pojo.Application;
import cn.bzu.fixprovider.pojo.Fix;
import cn.bzu.fixprovider.pojo.Msg;
import cn.bzu.fixprovider.service.FixService;
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
public class FixController {

    @Resource
    FixService fixService;

    /*
     * 添加维修计划*/
    @PostMapping("/fix")
    public Msg addEmp(@RequestBody Fix fix) {
        boolean insert = fixService.insert(fix);
        return Msg.success();
    }

    /*
     * 查询修改计划*/
    @GetMapping("/fixs")
    public Msg getFixs(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageMethod.startPage(pn,8);
        List<Fix> list = fixService.selectFixs();
        PageInfo pageInfo = new PageInfo(list,6);
        return Msg.success().add("pageInfo", pageInfo);
    }

    // 根据id查询维修计划
    @GetMapping("/fix/{id}")
    public Msg getFix(@PathVariable("id") Integer id) {
        Fix fix = fixService.selectById(id);
        return Msg.success().add("fixInfo", fix);
    }

}

