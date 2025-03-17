package models;

import java.sql.Date;

public class JobInfo {
    private String employeeId;
    private float salary;
    private Departement department;
    private Date joinDate;

    public JobInfo(String employeeId, float salary, Departement department, Date joinDate){
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
        this.joinDate = joinDate;
    }
}
