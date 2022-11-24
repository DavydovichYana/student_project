package edu.javacourse.studentorder.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StudentOrder {
    private long StudentOrderId;
    private StudentOrderStatus studentOrderStatus;
    private LocalDateTime studentOrderDate;
    private String MarrigeCertificateId;
    private LocalDate MarrigeDate;
    private RegisterOffice MarrigeOffice;
    private Adult husband;
    private Adult wife;
    private List<Child> children;

    public StudentOrderStatus getStudentOrderStatus() {
        return studentOrderStatus;
    }

    public void setStudentOrderStatus(StudentOrderStatus studentOrderStatus) {
        this.studentOrderStatus = studentOrderStatus;
    }

    public LocalDateTime getStudentOrderDate() {
        return studentOrderDate;
    }

    public void setStudentOrderDate(LocalDateTime studentOrderDate) {
        this.studentOrderDate = studentOrderDate;
    }

    public long getStudentOrderId() {
        return StudentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        StudentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void addChild(Child child) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
    }

    public String getMarrigeCertificateId() {
        return MarrigeCertificateId;
    }

    public void setMarrigeCertificateId(String marrigeCertificateId) {
        MarrigeCertificateId = marrigeCertificateId;
    }

    public LocalDate getMarrigeDate() {
        return MarrigeDate;
    }

    public void setMarrigeDate(LocalDate marrigeDate) {
        MarrigeDate = marrigeDate;
    }

    public RegisterOffice getMarrigeOffice() {
        return MarrigeOffice;
    }

    public void setMarrigeOffice(RegisterOffice marrigeOffice) {
        MarrigeOffice = marrigeOffice;
    }
}
