package cn.bzu.loginprovider.mapper;

import cn.bzu.loginprovider.pojo.Admin;
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
public interface AdminMapper extends BaseMapper<Admin> {

    @Select("select count(admin_id) from admin where admin_name = #{adminName} and admin_password = #{adminPassword}")
    public Integer getAdmin(@Param("adminName") String adminName, @Param("adminPassword") String adminPassword);

    @Select("select * from admin where admin_name = #{adminName} and admin_email = #{adminEmail}")
    public Admin getAdminByEmail(@Param("adminName") String adminName, @Param("adminEmail") String adminEmail);

}
