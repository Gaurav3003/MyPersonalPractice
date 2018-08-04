package com.db.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="PERMANENT_EMPLOYEE")
@DiscriminatorValue(value = "Regular")
public class PermanentEmployee extends Person{

    @Column(name="DEPT_NAME")
    private String departmentName;

    @Column(name="DEPT_CODE")
    private Integer deptCode;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(Integer deptCode) {
        this.deptCode = deptCode;
    }
}
