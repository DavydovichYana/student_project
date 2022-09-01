package edu.javacourse.studentorder.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentOrder {
    private long StudentOrderId;
    private long MarrigeCertificateId;
    private LocalDate MarrigeDate;
    private RegisterOffice MarrigeOffice;
    private Adult husband;
    private Adult wife;
    private List<Child> children;

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

    public void addChildren(Child child) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
    }

    public long getMarrigeCertificateId() {
        return MarrigeCertificateId;
    }

    public void setMarrigeCertificateId(long marrigeCertificateId) {
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
