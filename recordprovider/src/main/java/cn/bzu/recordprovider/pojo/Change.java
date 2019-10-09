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
public class Change extends Model<Change> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "record_id", type = IdType.AUTO)
    private Integer recordId;
    @TableField("emp_id")
    private Integer empId;
    @TableField("update_time")
    private Date updateTime;
    @TableField("before_apart")
    private Integer beforeApart;
    @TableField("after_apaet")
    private Integer afterApaet;
    @TableField("before_bed")
    private Integer beforeBed;
    @TableField("after_bed")
    private Integer afterBed;


    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
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

    public Integer getAfterApaet() {
        return afterApaet;
    }

    public void setAfterApaet(Integer afterApaet) {
        this.afterApaet = afterApaet;
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

    @Override
    protected Serializable pkVal() {
        return this.recordId;
    }

    @Override
    public String toString() {
        return "Change{" +
        ", recordId=" + recordId +
        ", empId=" + empId +
        ", updateTime=" + updateTime +
        ", beforeApart=" + beforeApart +
        ", afterApaet=" + afterApaet +
        ", beforeBed=" + beforeBed +
        ", afterBed=" + afterBed +
        "}";
    }
}
