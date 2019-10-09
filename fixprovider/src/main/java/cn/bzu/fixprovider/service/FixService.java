package cn.bzu.fixprovider.service;

import cn.bzu.fixprovider.pojo.Application;
import cn.bzu.fixprovider.pojo.Fix;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
public interface FixService extends IService<Fix> {

    List<Fix> selectFixs();


}
