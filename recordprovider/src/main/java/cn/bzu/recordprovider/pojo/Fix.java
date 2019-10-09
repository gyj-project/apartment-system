package cn.bzu.recordprovider.pojo;

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
 * @since 2019-10-07
 */
public class Fix extends Model<Fix> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "fix_id", type = IdType.AUTO)
    private Integer fixId;
    @TableField("fix_peo")
    private String fixPeo;
    @TableField("fix_room")
    private Integer fixRoom;
    @JsonFormat(pattern="yyyy-MM-dd")
    @TableField("fix_date")
    private Date fixDate;
    @TableField("fix_info")
    private String fixInfo;
    @TableField("if_finish")
    private Integer ifFinish;


    public Integer getFixId() {
        return fixId;
    }

    public void setFixId(Integer fixId) {
        this.fixId = fixId;
    }

    public String getFixPeo() {
        return fixPeo;
    }

    public void setFixPeo(String fixPeo) {
        this.fixPeo = fixPeo;
    }

    public Integer getFixRoom() {
        return fixRoom;
    }

    public void setFixRoom(Integer fixRoom) {
        this.fixRoom = fixRoom;
    }

    public Date getFixDate() {
        return fixDate;
    }

    public void setFixDate(Date fixDate) {
        this.fixDate = fixDate;
    }

    public String getFixInfo() {
        return fixInfo;
    }

    public void setFixInfo(String fixInfo) {
        this.fixInfo = fixInfo;
    }

    public Integer getIfFinish() {
        return ifFinish;
    }

    public void setIfFinish(Integer ifFinish) {
        this.ifFinish = ifFinish;
    }

    @Override
    protected Serializable pkVal() {
        return this.fixId;
    }

    @Override
    public String toString() {
        return "Fix{" +
        ", fixId=" + fixId +
        ", fixPeo=" + fixPeo +
        ", fixRoom=" + fixRoom +
        ", fixDate=" + fixDate +
        ", fixInfo=" + fixInfo +
        ", ifFinish=" + ifFinish +
        "}";
    }
}
