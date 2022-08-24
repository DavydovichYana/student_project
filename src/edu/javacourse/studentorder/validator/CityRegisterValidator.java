package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.CityRegisterChekerResponse;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.validator.register.CityRegisterCheсker;
import edu.javacourse.studentorder.validator.register.FakeCityRegisterChecker;

import java.util.List;

public class CityRegisterValidator {
    public String hostname;
    public String login;
    private String password;
    private CityRegisterCheсker personCheker;

    public CityRegisterValidator() {
        personCheker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        try {
            CityRegisterChekerResponse hans = personCheker.checkPerson(so.getHusband());
            CityRegisterChekerResponse wans = personCheker.checkPerson(so.getWife());

            List<Child> children = so.getChildren();
//            for(Iterator<Child> it = children.iterator(); it.hasNext(); ) {
//                Child child = it.next();
//                CityRegisterChekerResponse cans = personCheker.checkPerson(child);
//            }
// for each конструкция:
            for (Child child: children) {
                CityRegisterChekerResponse cans = personCheker.checkPerson(child);
            }

        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
