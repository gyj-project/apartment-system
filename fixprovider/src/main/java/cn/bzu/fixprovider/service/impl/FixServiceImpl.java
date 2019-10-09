package cn.bzu.fixprovider.service.impl;

import cn.bzu.fixprovider.pojo.Application;
import cn.bzu.fixprovider.pojo.Fix;
import cn.bzu.fixprovider.mapper.FixMapper;
import cn.bzu.fixprovider.service.FixService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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
public class FixServiceImpl extends ServiceImpl<FixMapper, Fix> implements FixService {

    @Resource
    FixMapper fixMapper;
    @Override
    public List<Fix> selectFixs() {
        return fixMapper.selectFixs();
    }
}
