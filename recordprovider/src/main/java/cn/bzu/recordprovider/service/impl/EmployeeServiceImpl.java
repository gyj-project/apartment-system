package cn.bzu.recordprovider.service.impl;

import cn.bzu.recordprovider.pojo.Employee;
import cn.bzu.recordprovider.mapper.EmployeeMapper;
import cn.bzu.recordprovider.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-10-07
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
