package cn.bzu.liveprovider.controller;


import cn.bzu.liveprovider.mapper.EmployeeMapper;
import cn.bzu.liveprovider.pojo.Employee;
import cn.bzu.liveprovider.pojo.Msg;
import cn.bzu.liveprovider.service.impl.EmployeeServiceImpl;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author
 * @since 2019-09-30
 */
@RestController
public class EmployeeController {

    @Resource
    private EmployeeServiceImpl employeeService;

    /*
     * 分页查询员工信息*/
    @GetMapping("/emps")
    public Msg getEmps(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {

        PageMethod.startPage(pn, 8);
        List<Employee> list = employeeService.getEmps();
        PageInfo pageInfo = new PageInfo(list, 6);
        return Msg.success().add("pageInfo", pageInfo);

    }

    @GetMapping("/emp/{id}")
    public Msg getEmp(@PathVariable("id") Integer id) {
        Employee employee = employeeService.getEmpById(id);
        return Msg.success().add("empInfo", employee);
    }

    /*
     * 根据条件分页搜索员工信息*/
    @GetMapping("/semps")
    public Msg searchEmps(@RequestParam(value = "pn", defaultValue = "1") Integer pn, @RequestParam("type") String type, @RequestParam("info") String info) throws ParseException {
        PageMethod.startPage(pn, 8);

        List<Employee> list = employeeService.searchEmps(type, info);

        PageInfo pageInfo = new PageInfo(list, 6);
        return Msg.success().add("pageInfo", pageInfo);

    }

    /*
     * 修改员工*/
    @PutMapping("/emp")
    public void updateEmp(@RequestBody Employee employee) {
        employeeService.updateEmp(employee);
    }

    /*
     * 删除员工*/
    @DeleteMapping("/emp/{id}")
    public Msg deleteEmp(@PathVariable("id") Integer empId) {
        employeeService.deleteEmpById(empId);
        return Msg.success();
    }

    /*
     * 添加员工*/
    @PostMapping("/emp")
    public Msg addEmp(@RequestBody Employee employee) {
        Integer succ = employeeService.insertEmp(employee);
        if (succ == 1)
            return Msg.success();
        else
            return Msg.fail();
    }


}

