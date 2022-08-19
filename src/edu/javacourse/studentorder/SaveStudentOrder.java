package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so;
        so = new StudentOrder();
        so.sethFirstName("Alex");
        so.sethLastName("Petrov");
        so.setwFirstName("Galina");
        so.setwLastName("Petrova");

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }
    static long saveStudentOrder(StudentOrder so) {
        long answer = 99;
        System.out.println("Save StudentOrder 1: " + so.gethFirstName());

        return answer;
    }
}
