package cn.bzu.fixprovider.service.impl;

import cn.bzu.fixprovider.pojo.Application;
import cn.bzu.fixprovider.mapper.ApplicationMapper;
import cn.bzu.fixprovider.service.ApplicationService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
@Service
public class ApplicationServiceImpl extends ServiceImpl<ApplicationMapper, Application> implements ApplicationService {

    @Resource
    ApplicationMapper applicationMapper;

    @Override
    public List<Application> selectApps() {
        return applicationMapper.selectApps();
    }

    @Override
    public Application selectAppById(Integer id) {
        return applicationMapper.selectAppById(id);
    }

    @Override
    public void updateAppSetIfRead(Integer id) {
        applicationMapper.updateAppSetRead(id);
    }


}
