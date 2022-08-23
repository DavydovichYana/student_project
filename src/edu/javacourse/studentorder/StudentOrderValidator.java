package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {
    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    public void checkAll() {
        StudentOrder[] soArray = readStudentOrders();

        for (StudentOrder so: soArray) {
            System.out.println("\nOrder " + so.getStudentOrderId() + " is running. Wait a minute, please.");
            checkOneOrder(so);
        }
    }

    public StudentOrder[] readStudentOrders() {
        StudentOrder[] soArray = new StudentOrder[5];

        for(int i = 0 ; i < soArray.length ; i++ ) {
            soArray[i] = SaveStudentOrder.buildStudentOrder(i);
        }
        return soArray;
    }
    
    public void checkOneOrder(StudentOrder so){
        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerChildren ansChild = checkChildren(so);
        AnswerWedding wedAnswer = checkMarrige(so);
        AnswerStudent answerStudent = checkStudent(so);
        sendMail(so);
    }


    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkMarrige(StudentOrder so) {
        return weddingVal.checkMarrige(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
