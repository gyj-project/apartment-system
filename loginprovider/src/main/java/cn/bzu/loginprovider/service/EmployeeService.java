package cn.bzu.loginprovider.service;

import cn.bzu.loginprovider.pojo.Employee;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
public interface EmployeeService extends IService<Employee> {

    boolean empLogin(String name, String pass);
}
