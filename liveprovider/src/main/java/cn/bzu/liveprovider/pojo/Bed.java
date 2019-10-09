package cn.bzu.liveprovider.pojo;

import com.baomidou.mybatisplus.enums.IdType;
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
 * @since 2019-09-30
 */
public class Bed extends Model<Bed> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "bed_id", type = IdType.AUTO)
    private Integer bedId;
    @TableField("bed_no")
    private Integer bedNo;
    @TableField("apart_id")
    private Integer apartId;
    @TableField("if_peo")
    private Integer ifPeo;


    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public Integer getBedNo() {
        return bedNo;
    }

    public void setBedNo(Integer bedNo) {
        this.bedNo = bedNo;
    }

    public Integer getApartId() {
        return apartId;
    }

    public void setApartId(Integer apartId) {
        this.apartId = apartId;
    }

    public Integer getIfPeo() {
        return ifPeo;
    }

    public void setIfPeo(Integer ifPeo) {
        this.ifPeo = ifPeo;
    }

    @Override
    protected Serializable pkVal() {
        return this.bedId;
    }

    @Override
    public String toString() {
        return "Bed{" +
                ", bedId=" + bedId +
                ", bedNo=" + bedNo +
                ", apartId=" + apartId +
                ", ifPeo=" + ifPeo +
                "}";
    }
}
