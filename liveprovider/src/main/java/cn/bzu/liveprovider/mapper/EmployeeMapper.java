package cn.bzu.liveprovider.mapper;

import cn.bzu.liveprovider.pojo.Employee;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-09-30
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

    List<Employee> selectEmps();

    Employee selectEmpByEmpId(@Param("empId") Integer empId);

    List<Employee> selectEmpsByApartId(@Param("apartId") Integer apartId);

    List<Employee> selectEmpsByEmpIn(@Param("empIn") Date empIn);

    List<Employee> selectEmpsByBedNo(@Param("bedNo") Integer bedNo);

    List<Employee> selectEmpsByEmpName(@Param("empName") String empName);

    void updateEmp(Integer empId, Integer apartId, Integer bedNo);
}
