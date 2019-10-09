package cn.bzu.manageconsumer.pojo;


import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-10-03
 */
public class Fix implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer fixId;
    private String fixPeo;
    private Integer fixRoom;
    private Date fixDate;
    private String fixInfo;
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
