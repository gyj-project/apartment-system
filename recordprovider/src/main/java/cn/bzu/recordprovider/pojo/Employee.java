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
public class Employee extends Model<Employee> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "emp_id", type = IdType.AUTO)
    private Integer empId;
    @TableField("emp_password")
    private String empPassword;
    @TableField("emp_name")
    private String empName;
    @TableField("emp_gender")
    private Integer empGender;
    @TableField("emp_in")
    private Date empIn;
    @TableField("apart_id")
    private Integer apartId;
    @TableField("bed_no")
    private Integer bedNo;


    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpGender() {
        return empGender;
    }

    public void setEmpGender(Integer empGender) {
        this.empGender = empGender;
    }

    public Date getEmpIn() {
        return empIn;
    }

    public void setEmpIn(Date empIn) {
        this.empIn = empIn;
    }

    public Integer getApartId() {
        return apartId;
    }

    public void setApartId(Integer apartId) {
        this.apartId = apartId;
    }

    public Integer getBedNo() {
        return bedNo;
    }

    public void setBedNo(Integer bedNo) {
        this.bedNo = bedNo;
    }

    @Override
    protected Serializable pkVal() {
        return this.empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
        ", empId=" + empId +
        ", empPassword=" + empPassword +
        ", empName=" + empName +
        ", empGender=" + empGender +
        ", empIn=" + empIn +
        ", apartId=" + apartId +
        ", bedNo=" + bedNo +
        "}";
    }
}
