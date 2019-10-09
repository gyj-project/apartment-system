package cn.bzu.recordprovider.mapper;

import cn.bzu.recordprovider.pojo.Fix;
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
 * @since 2019-10-07
 */
@Mapper
public interface FixMapper extends BaseMapper<Fix> {
    @Select("select * from fix order by fix_id desc")
    List<Fix> selectFixs();

}
