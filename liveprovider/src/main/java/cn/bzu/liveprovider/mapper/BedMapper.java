package cn.bzu.liveprovider.mapper;

import cn.bzu.liveprovider.pojo.Bed;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-09-30
 */
@Mapper
public interface BedMapper extends BaseMapper<Bed> {

    //根据宿舍和床位号查询床铺
    Bed selectBedByApartIdAndBedNo(Integer apartId, Integer bedNo);

    //根据宿舍和床位号设置床铺没有人
    void updateSetPeopleNo(Integer apartId, Integer bedNo);

    //根据宿舍和床位号设置床铺有人
    void updateSetPeopleYes(Integer apartId, Integer bedNo);

}
