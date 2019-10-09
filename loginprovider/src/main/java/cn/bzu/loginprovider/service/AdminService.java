package cn.bzu.loginprovider.service;

import cn.bzu.loginprovider.pojo.Admin;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
public interface AdminService extends IService<Admin> {

    public boolean adminLogin(String name, String pass);

    public boolean getPass(String name, String email);

}
