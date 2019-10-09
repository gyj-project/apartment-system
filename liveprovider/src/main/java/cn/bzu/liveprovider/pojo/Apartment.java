package cn.bzu.liveprovider.pojo;

import com.baomidou.mybatisplus.annotations.TableId;
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
public class Apartment extends Model<Apartment> {

    private static final long serialVersionUID = 1L;

    @TableId("apart_id")
    private Integer apartId;


    public Integer getApartId() {
        return apartId;
    }

    public void setApartId(Integer apartId) {
        this.apartId = apartId;
    }

    @Override
    protected Serializable pkVal() {
        return this.apartId;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                ", apartId=" + apartId +
                "}";
    }
}
