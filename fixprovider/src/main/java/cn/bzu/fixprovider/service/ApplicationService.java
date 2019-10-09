package cn.bzu.fixprovider.service;

import cn.bzu.fixprovider.pojo.Application;
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
public interface ApplicationService extends IService<Application> {

    List<Application> selectApps();

    Application selectAppById(Integer id);

    void updateAppSetIfRead(Integer id);

}
