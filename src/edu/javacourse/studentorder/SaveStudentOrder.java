package edu.javacourse.studentorder;

import edu.javacourse.studentorder.dao.DictionaryDaoImpl;
import edu.javacourse.studentorder.domain.*;

import java.time.LocalDate;
import java.util.List;
public class SaveStudentOrder
{
    public static void main(String[] args) throws Exception {
        List<Street> d = new DictionaryDaoImpl().findStreets("про");
        for(Street s : d) {
            System.out.println(s.getStreetName());
        }
        List<PassportOffice> po = new DictionaryDaoImpl().findPassportOffices("010020000000");
        for(PassportOffice p : po) {
            System.out.println(p.getOfficeName());
        }

        List<RegisterOffice> ro = new DictionaryDaoImpl().findRegisterOffices("010010000000");
        for(RegisterOffice r : ro) {
            System.out.println(r.getOfficeName());
        }

//        StudentOrder s = buildStudentOrder(10);
//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }

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
        RegisterOffice ro1 = new RegisterOffice(1L,"","");
        so.setMarrigeOffice(ro1);

        Street street = new Street(1L, "Aviatsionnaya street");

        Adress adress = new Adress("1535244", street, "12", "", "142");

        //Husband
        Adult husband = new Adult("Petrov", "Afanasii", "Sergeevich", LocalDate.of(1999, 5, 23));
        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (10000 + id));
        husband.setIssueDate(LocalDate.of(2022, 1, 22));
        PassportOffice po1 = new PassportOffice(1L,"","");
        husband.setIssueDepartment(po1);
        husband.setStudentId("" + (1000000 + id));
        husband.setAdress(adress);

        //Wife
        Adult wife = new Adult("Petrova", "Olga", "Alekseevna", LocalDate.of(2000, 1, 7));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (20000 + id));
        wife.setIssueDate(LocalDate.of(2020, 11, 5));
        PassportOffice po2 = new PassportOffice(2L,"","");
        wife.setIssueDepartment(po2);
        wife.setStudentId("" + (2000000 + id));
        wife.setAdress(adress);

        //Child
        Child child = new Child("Petrova", "Irina", "Afanasievna", LocalDate.of(2018, 6, 29));
        child.setCertificateNumber("" + (300000 + id));
        child.setIssueDate(LocalDate.of(2018, 7, 19));
        RegisterOffice ro2 = new RegisterOffice(2L,"","");
        child.setIssueDepartment(ro2);
        child.setAdress(adress);

        so.setHusband(husband);
        so.setWife(wife);
        so.addChildren(child);

        return so;
    }
}
