package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.CityRegisterException;

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
            personCheker.checkPerson(so.getHusband());
            personCheker.checkPerson(so.getWife());
            personCheker.checkPerson(so.getChild());
        } catch (CityRegisterException ex) {
            ex.printStackTrace();
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
