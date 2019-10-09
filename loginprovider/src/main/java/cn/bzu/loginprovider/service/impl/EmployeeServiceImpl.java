package cn.bzu.loginprovider.service.impl;

import cn.bzu.loginprovider.mapper.AdminMapper;
import cn.bzu.loginprovider.pojo.Admin;
import cn.bzu.loginprovider.pojo.Employee;
import cn.bzu.loginprovider.mapper.EmployeeMapper;
import cn.bzu.loginprovider.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Autowired
    private JavaMailSender mailSender;

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public boolean empLogin( String name, String pass) {

        Integer num = employeeMapper.selectEmpByNameAndPass(name, pass);

        return num != 0;
    }
}
