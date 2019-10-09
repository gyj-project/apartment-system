package cn.bzu.loginprovider.service.impl;

import cn.bzu.loginprovider.pojo.Admin;
import cn.bzu.loginprovider.mapper.AdminMapper;
import cn.bzu.loginprovider.service.AdminService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    private JavaMailSender mailSender;

    @Resource
    private AdminMapper adminMapper;


    // 找回密码
    @Override
    public boolean getPass(String name, String email) {

        Admin admin = adminMapper.getAdminByEmail(name, email);
        if (null != admin) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        MimeMessage mimeMessage = mailSender.createMimeMessage();
                        MimeMessageHelper helper = null;

                        helper = new MimeMessageHelper(mimeMessage, true);

                        helper.setSubject("密码找回");
                        helper.setText("尊敬的"+admin.getAdminName()+",你的密码是：<b style='color:red'>" + admin.getAdminPassword() + "</b>", true);

                        helper.setTo(email);
                        helper.setFrom("1807069286@qq.com");

                      //  helper.addAttachment("qq邮箱密码", new File("C:\\Users\\Shinelon\\Desktop\\乱七八糟\\qq邮箱.txt"));
                        mailSender.send(mimeMessage);
                    } catch (MessagingException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        return admin != null;

    }

    @Override
    public boolean adminLogin(String name, String pass) {

        Integer num = adminMapper.getAdmin(name, pass);

        return num != 0;
    }


}
