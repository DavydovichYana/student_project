package edu.javacourse.studentorder;

import edu.javacourse.studentorder.dao.DictionaryDaoImpl;
import edu.javacourse.studentorder.domain.*;

import java.time.LocalDate;
import java.util.List;

public class SaveStudentOrder {
    public static void main(String[] args) throws Exception{
        List<Street> d = new DictionaryDaoImpl().findStreets("su");
        for(Street s : d) {
            System.out.println(s.getStreetName() + s.getStreetCode());
        }
    }
        //        long id = 0;
//        buildStudentOrder(id);

    static long saveStudentOrder(StudentOrder so) {
        long answer = 99;
        System.out.println("Save StudentOrder");
        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        so.setMarrigeCertificateId(id);
        so.setMarrigeDate(LocalDate.of(2016, 7, 24));
        so.setMarrigeOffice("Отдел ЗАГС Новокашинского района");

        Street street = new Street(1L, "Aviatsionnaya street");

        Adress adress = new Adress("1535244", street, "12", "", "142");

        //Husband
        Adult husband = new Adult("Petrov", "Afanasii", "Sergeevich", LocalDate.of(1999, 5, 23));
        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (10000 + id));
        husband.setIssueDate(LocalDate.of(2022, 1, 22));
        husband.setIssueDepartment("Отдел милиции № " + id);
        husband.setStudentId("" + (1000000 + id));
        husband.setAdress(adress);

        //Wife
        Adult wife = new Adult("Petrova", "Olga", "Alekseevna", LocalDate.of(2000, 1, 7));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (20000 + id));
        wife.setIssueDate(LocalDate.of(2020, 11, 5));
        wife.setIssueDepartment("Отдел милиции № " + id);
        wife.setStudentId("" + (2000000 + id));
        wife.setAdress(adress);

        //Child
        Child child = new Child("Petrova", "Irina", "Afanasievna", LocalDate.of(2018, 6, 29));
        child.setCertificateNumber("" + (300000 + id));
        child.setIssueDate(LocalDate.of(2018, 7, 19));
        child.setIssueDepartment("ОТдел ЗАГС №" + id);
        child.setAdress(adress);

        so.setHusband(husband);
        so.setWife(wife);
        so.addChildren(child);

        return so;
    }
}
