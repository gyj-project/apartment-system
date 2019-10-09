package cn.bzu.manageconsumer.controller;


import cn.bzu.manageconsumer.pojo.Fix;
import cn.bzu.manageconsumer.pojo.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2019-09-30
 */
@RestController
public class FixController {

    @Autowired
    public RestTemplate restTemplate;

    // 提交维修计划
    @PostMapping("/fix")
    public Msg addEmp(Fix fix){

        Msg msg = restTemplate.postForObject("http://FIX-PROVIDER/fix", fix, Msg.class);
        return msg;
    }

    // 查询维修计划
    @GetMapping("/fixs")
    public Msg getFixs(@RequestParam(value="pn",defaultValue="1") Integer pn){
        Msg msg = restTemplate.getForObject("http://FIX-PROVIDER/fixs?pn="+pn, Msg.class);
        return msg;
    }

    // 根据id修改维修计划
    @GetMapping("/fix/{id}")
    public Msg getFixById(@PathVariable("id") Integer id) {
        Msg msg = restTemplate.getForObject("http://FIX-PROVIDER/fix/"+id, Msg.class);
        return msg;
    }

}

