package cn.bzu.liveprovider.service.impl;

import cn.bzu.liveprovider.mapper.BedMapper;
import cn.bzu.liveprovider.pojo.Bed;
import cn.bzu.liveprovider.pojo.Employee;
import cn.bzu.liveprovider.mapper.EmployeeMapper;
import cn.bzu.liveprovider.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author
 * @since 2019-09-30
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Resource
    EmployeeMapper employeeMapper;

    @Resource
    BedMapper bedMapper;

    //得到全部的员工
    @Override
    public List<Employee> getEmps() {
        return employeeMapper.selectEmps();
    }


    //根据Id查询员工
    @Override
    public Employee getEmpById(Integer id) {
        Employee employee = new Employee();
        employee.setEmpId(id);
        return employeeMapper.selectOne(employee);
    }

    //条件搜索
    @Override
    public List<Employee> searchEmps(String type, String info) throws ParseException {
        //如果查询条件为房间号
        if ("apartId".equals(type)) {
            Integer apartId = Integer.parseInt(info);
            return employeeMapper.selectEmpsByApartId(apartId);

        }
        //如果查询条件为床位
        else if ("bedNo".equals(type)) {
            Integer bedNo = Integer.parseInt(info);
            return employeeMapper.selectEmpsByBedNo(bedNo);
        }
        //如果查询条件为入住日期
        else if ("empIn".equals(type)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date empIn = sdf.parse(info);
            return employeeMapper.selectEmpsByEmpIn(empIn);
        }
        //如果查询条件为员工的姓名
        else if ("empName".equals(type)) {
            return employeeMapper.selectEmpsByEmpName(info);
        }
        return null;
    }

    @Override
    public Integer updateEmp(Employee employee) {

        //得到原信息
        Employee oldEmp = employeeMapper.selectEmpByEmpId(employee.getEmpId());
        int oldApartId = oldEmp.getApartId();
        int oldBedNo = oldEmp.getBedNo();


        //得到新信息
        Integer apartId = employee.getApartId();
        Integer bedNo = employee.getBedNo();

        //执行插入操作
        employeeMapper.updateEmp(employee.getEmpId(), apartId, bedNo);


        //修改bed表
        bedMapper.updateSetPeopleNo(oldApartId, oldBedNo);
        bedMapper.updateSetPeopleYes(apartId, bedNo);

        return 1;


    }


    // 添加员工住宿，并设置床位有人
    public Integer insertEmp(Employee employee) {

        employeeMapper.insert(employee);

        bedMapper.updateSetPeopleYes(employee.getApartId(), employee.getBedNo());

        return 1;

    }

    // 添加员工住宿，并设置床位无人
    @Override
    public void deleteEmpById(Integer id) {

        Employee employee = employeeMapper.selectEmpByEmpId(id);

        if (null != employee.getApartId() && null != employee.getBedNo())
            bedMapper.updateSetPeopleNo(employee.getApartId(), employee.getBedNo());

        employeeMapper.deleteById(id);
    }


    public List<Employee> selectEmpWithNoTypeButInfo(Integer pn, String type){
        List<Employee> list = new ArrayList<>();

        try {
            int t = Integer.parseInt(type);
            if (null != employeeMapper.selectEmpByEmpId(t))
                list.add(employeeMapper.selectEmpByEmpId(t));

            if (null != employeeMapper.selectEmpsByApartId(t))
                list.addAll(employeeMapper.selectEmpsByApartId(t));

            if (null != employeeMapper.selectEmpsByBedNo(t))
                list.addAll(employeeMapper.selectEmpsByBedNo(t));
        } catch(Exception e) {
        } finally {

        }


        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Date date = sdf.parse(type);

            list.addAll(employeeMapper.selectEmpsByEmpIn(date));


        } catch (ParseException e) {
            e.printStackTrace();
        }


        list.addAll(employeeMapper.selectEmpsByEmpName(type));

        return list;

    }
}
