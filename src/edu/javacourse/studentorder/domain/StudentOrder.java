package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class StudentOrder
{
    private long StudentOrderId;
    private long MarrigeCertificateId;
    private LocalDate MarrigeDate;
    private String MarrigeOffice;
    private Adult husband;
    private Adult wife;
    private Child child;

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

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
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

    public String getMarrigeOffice() {
        return MarrigeOffice;
    }

    public void setMarrigeOffice(String marrigeOffice) {
        MarrigeOffice = marrigeOffice;
    }
}
