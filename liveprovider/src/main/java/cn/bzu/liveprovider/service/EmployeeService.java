package cn.bzu.liveprovider.service;

import cn.bzu.liveprovider.pojo.Employee;
import com.baomidou.mybatisplus.service.IService;

import java.text.ParseException;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author
 * @since 2019-09-30
 */
public interface EmployeeService extends IService<Employee> {

    List<Employee> getEmps();

    Employee getEmpById(Integer id);

    List<Employee> searchEmps(String type, String info) throws ParseException;

    Integer updateEmp(Employee employee);

    Integer insertEmp(Employee employee);

    void deleteEmpById(Integer id);
}
