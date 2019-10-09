package cn.bzu.manageconsumer.controller;




import cn.bzu.manageconsumer.pojo.Employee;
import cn.bzu.manageconsumer.pojo.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2019-09-30
 */
@RestController
public class EmployeeController {

    @Resource
    public RestTemplate restTemplate;

    // 分页查询
    @GetMapping("/emps")
    public Msg getEmps(@RequestParam(value="pn",defaultValue="1") Integer pn){
        Msg msg = restTemplate.getForObject("http://LIVE-PROVIDER/emps?pn="+pn, Msg.class);
        return msg;
    }
    //通过id查询
    @GetMapping("/emp/{id}")
    public Msg getEmpById(@PathVariable("id") Integer id) {
        Msg msg = restTemplate.getForObject("http://LIVE-PROVIDER/emp/"+id, Msg.class);
        return msg;
    }

    /*
     * 根据条件分页搜索员工信息*/
    @GetMapping("/semps")
    public Msg searchEmps(@RequestParam(value = "pn", defaultValue = "1") Integer pn,@RequestParam("type") String type,@RequestParam("info") String info) {
        Msg msg = restTemplate.getForObject("http://LIVE-PROVIDER/semps?pn="+pn+"&type="+type+"&info="+info, Msg.class);
        return msg;

    }

    /*
    * 修改员工住宿信息*/
    @PutMapping("/emp")
    public Msg updateEmp(@RequestBody Employee employee){
            restTemplate.put("http://LIVE-PROVIDER/emp", employee);
            return Msg.success();

    }

    // 根据id删除员工
    @DeleteMapping("/emp/{empId}")
    public Msg deleteEmp(@PathVariable("empId") Integer empId){
        restTemplate.delete("http://LIVE-PROVIDER/emp/"+empId);
        return Msg.success();
    }

    // 添加员工
    @PostMapping("/emp")
    public Msg addEmp( Employee employee){
        System.out.println(employee.getEmpName());
        Msg msg = restTemplate.postForObject("http://LIVE-PROVIDER/emp",employee, Msg.class);
        return msg;
    }

}

