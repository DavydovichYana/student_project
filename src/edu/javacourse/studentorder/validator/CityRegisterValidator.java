package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.domain.register.AnswerCityRegisterItem;
import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.validator.register.CityRegisterCheсker;
import edu.javacourse.studentorder.validator.register.FakeCityRegisterChecker;

public class CityRegisterValidator {

    private final CityRegisterCheсker personCheker;

    public CityRegisterValidator() {
        personCheker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.addItem(checkPerson(so.getHusband()));
        ans.addItem(checkPerson(so.getWife()));

        for (Child child : so.getChildren()) {
            ans.addItem(checkPerson(child));
        }
        return ans;
    }

    private AnswerCityRegisterItem checkPerson(Person person) {
        try {
            CityRegisterResponse cans = personCheker.checkPerson(person);
        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }
        return null; // todo
    }
}
