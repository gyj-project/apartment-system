package cn.bzu.recordprovider.pojo;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
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
 * @since 2019-10-07
 */
public class Application extends Model<Application> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "app_id", type = IdType.AUTO)
    private Integer appId;
    @TableField("emp_id")
    private Integer empId;
    @TableField("app_info")
    private String appInfo;
    @TableField("app_time")
    private Date appTime;
    @TableField("if_read")
    private Integer ifRead;


    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(String appInfo) {
        this.appInfo = appInfo;
    }

    public Date getAppTime() {
        return appTime;
    }

    public void setAppTime(Date appTime) {
        this.appTime = appTime;
    }

    public Integer getIfRead() {
        return ifRead;
    }

    public void setIfRead(Integer ifRead) {
        this.ifRead = ifRead;
    }

    @Override
    protected Serializable pkVal() {
        return this.appId;
    }

    @Override
    public String toString() {
        return "Application{" +
        ", appId=" + appId +
        ", empId=" + empId +
        ", appInfo=" + appInfo +
        ", appTime=" + appTime +
        ", ifRead=" + ifRead +
        "}";
    }
}
