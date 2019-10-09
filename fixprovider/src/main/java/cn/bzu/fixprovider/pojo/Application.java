package cn.bzu.fixprovider.pojo;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
public class Application extends Model<Application> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "app_id", type = IdType.AUTO)
    private Integer appId;
    @TableField("emp_id")
    private Integer empId;
    @TableField("app_info")
    private String appInfo;

    @JsonFormat(pattern="yyyy-MM-dd")
    @TableField("app_time")
    private Date appTime;
    @TableField("if_read")
    private String ifRead;


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

    public String getIfRead() {
        return ifRead;
    }

    public void setIfRead(String ifRead) {
        this.ifRead = ifRead;
    }

    @Override
    public String toString() {
        return "Application{" +
                "appId=" + appId +
                ", empId=" + empId +
                ", appInfo='" + appInfo + '\'' +
                ", appTime=" + appTime +
                ", ifRead='" + ifRead + '\'' +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return this.appId;
    }


}
