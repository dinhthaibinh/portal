package com.portal.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "assignment")
public class AssignmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assignmentId;
    @Column(name = "fromdate")
    private Timestamp fromDate;
    @Column(name = "enddate")
    private Timestamp endDate;
    @Column(name = "workload")
    private Long workload;
    @Column(name = "assignmentcost")
    private Long assignmentCost;
    @Column(name = "rate")
    private Integer rate;

    @ManyToOne
    @JoinColumn(name = "employeeid")
    private EmployeeEntity employeeEntity;
    @ManyToOne
    @JoinColumn(name = "projectid")
    private ProjectEntity projectEntity;

    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Timestamp getFromDate() {
        return fromDate;
    }

    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Long getWorkload() {
        return workload;
    }

    public void setWorkload(Long workload) {
        this.workload = workload;
    }

    public Long getAssignmentCost() {
        return assignmentCost;
    }

    public void setAssignmentCost(Long assignmentCost) {
        this.assignmentCost = assignmentCost;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public ProjectEntity getProjectEntity() {
        return projectEntity;
    }

    public void setProjectEntity(ProjectEntity projectEntity) {
        this.projectEntity = projectEntity;
    }
}
