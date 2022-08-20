package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder();

//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }
    static long saveStudentOrder(StudentOrder so) {
        long answer = 99;
        System.out.println("Save StudentOrder");

        return answer;
    }

    static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Oleg");
        husband.setSurName("Blinov");
        husband.setPassportNumber(8893);
        so.setHusband(husband);

        String ans = husband.getPersonString();
        System.out.println(ans);
        return so;
    }
}
