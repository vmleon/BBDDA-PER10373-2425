package com.unir.employees.data;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeptEmpId implements Serializable {
    private Integer employee;
    private String department;
}
