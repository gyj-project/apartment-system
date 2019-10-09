package cn.bzu.loginprovider.pojo;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
public class Admin extends Model<Admin> {

    private static final long serialVersionUID = 1L;

    @TableId("admin_id")
    private Integer adminId;
    @TableField("admin_name")
    private String adminName;
    @TableField("admin_password")
    private String adminPassword;
    @TableField("admin_email")
    private String adminEmail;

    public Admin() {
    }

    public Admin(Integer adminId, String adminName, String adminPassword, String adminEmail) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminEmail = adminEmail;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPass) {
        this.adminPassword = adminPass;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    protected Serializable pkVal() {
        return this.adminId;
    }

    @Override
    public String toString() {
        return "Admin{" +
        ", adminId=" + adminId +
        ", adminName=" + adminName +
        ", adminPassword=" + adminPassword +
        ", adminEmail=" + adminEmail +
        "}";
    }
}
