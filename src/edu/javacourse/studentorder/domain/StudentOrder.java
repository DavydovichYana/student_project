package edu.javacourse.studentorder.domain;

public class StudentOrder
{
    private long StudentOrderId;
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
}
