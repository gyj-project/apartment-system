package cn.bzu.fixprovider.mapper;

import cn.bzu.fixprovider.pojo.Fix;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
public interface FixMapper extends BaseMapper<Fix> {

    @Select("select * from fix order by fix_id desc")
    List<Fix> selectFixs();


}
