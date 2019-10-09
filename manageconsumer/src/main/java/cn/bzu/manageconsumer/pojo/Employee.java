package cn.bzu.manageconsumer.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-09-30
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer empId;

    private String empPassword;

    private String empName;

    private Integer empGender;


    @JsonFormat(pattern="yyyy-MM-dd")
    private Date empIn;

    private Integer apartId;

    private Integer bedNo;

    public Employee(Integer empId, String empPassword, String empName, Integer empGender, Date empIn, Integer apartId, Integer bedNo) {
        this.empId = empId;
        this.empPassword = empPassword;
        this.empName = empName;
        this.empGender = empGender;
        this.empIn = empIn;
        this.apartId = apartId;
        this.bedNo = bedNo;
    }

    public Employee() {
    }

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
