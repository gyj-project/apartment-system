package cn.bzu.loginprovider.mapper;

import cn.bzu.loginprovider.pojo.Admin;
import cn.bzu.loginprovider.pojo.Employee;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {


    @Select("select count(emp_id) from employee where emp_name = #{empName} and emp_password = #{empPassword}")
    public Integer selectEmpByNameAndPass(@Param("empName") String empName, @Param("empPassword") String empPassword);


}
