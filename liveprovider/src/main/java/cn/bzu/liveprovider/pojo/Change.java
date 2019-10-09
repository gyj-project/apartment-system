package cn.bzu.liveprovider.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Change implements Serializable {

    private Integer changeId;
    private Integer empId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;
    private Integer beforeApart;
    private Integer afterApart;
    private Integer beforeBed;
    private Integer afterBed;

    public Integer getChangeId() {
        return changeId;
    }

    public void setChangeId(Integer changeId) {
        this.changeId = changeId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getBeforeApart() {
        return beforeApart;
    }

    public void setBeforeApart(Integer beforeApart) {
        this.beforeApart = beforeApart;
    }

    public Integer getAfterApart() {
        return afterApart;
    }

    public void setAfterApart(Integer afterApart) {
        this.afterApart = afterApart;
    }

    public Integer getBeforeBed() {
        return beforeBed;
    }

    public void setBeforeBed(Integer beforeBed) {
        this.beforeBed = beforeBed;
    }

    public Integer getAfterBed() {
        return afterBed;
    }

    public void setAfterBed(Integer afterBed) {
        this.afterBed = afterBed;
    }
}
