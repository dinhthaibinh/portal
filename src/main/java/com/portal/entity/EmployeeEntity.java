package com.portal.entity;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    @Column(name = "firstname")
    private String firstnName;
    @Column(name = "lastname")
    private String lasrName;
    @Column(name = "email")
    private String email;
    @Column(name = "phonenumber")
    private String phoneNumber;
    @Column(name = "currentworkload")
    private Long currentWorkload;
    @Column(name = "address")
    private String address;
    @Column(name = "hiredate")
    private Timestamp hireDate;
    @Column(name = "quitdate")
    private Timestamp quitDate;
    @Column(name = "avatarfile")
    private Blob avatarFile;
    @Column(name = "currentjointprojectnumber")
    private Long currentJointProjectNumber;
    @Column(name = "jointprojectnumber")
    private Long jointProjectNumber;

    @OneToOne
    @JoinColumn(name = "userid")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "employeeEntity")
    private Set<AssignmentEntity> assignmentEntities;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstnName() {
        return firstnName;
    }

    public void setFirstnName(String firstnName) {
        this.firstnName = firstnName;
    }

    public String getLasrName() {
        return lasrName;
    }

    public void setLasrName(String lasrName) {
        this.lasrName = lasrName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getCurrentWorkload() {
        return currentWorkload;
    }

    public void setCurrentWorkload(Long currentWorkload) {
        this.currentWorkload = currentWorkload;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    public Timestamp getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(Timestamp quitDate) {
        this.quitDate = quitDate;
    }

    public Blob getAvatarFile() {
        return avatarFile;
    }

    public void setAvatarFile(Blob avatarFile) {
        this.avatarFile = avatarFile;
    }

    public Long getCurrentJointProjectNumber() {
        return currentJointProjectNumber;
    }

    public void setCurrentJointProjectNumber(Long currentJointProjectNumber) {
        this.currentJointProjectNumber = currentJointProjectNumber;
    }

    public Long getJointProjectNumber() {
        return jointProjectNumber;
    }

    public void setJointProjectNumber(Long jointProjectNumber) {
        this.jointProjectNumber = jointProjectNumber;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public Set<AssignmentEntity> getAssignmentEntities() {
        return assignmentEntities;
    }

    public void setAssignmentEntities(Set<AssignmentEntity> assignmentEntities) {
        this.assignmentEntities = assignmentEntities;
    }
}
