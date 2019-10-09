package cn.bzu.fixprovider.mapper;

import cn.bzu.fixprovider.pojo.Application;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
@Mapper
public interface ApplicationMapper extends BaseMapper<Application> {

    @Select("select * from application order by app_id desc")
    List<Application> selectApps();

    @Select("select * from application where `app_id` = #{appId}")
    Application selectAppById(@Param("appId") Integer appId);

    @Update("update application set if_read = 1 where app_id = #{appId}")
    void updateAppSetRead(@Param("appId") Integer appId);

}
