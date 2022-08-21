package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.StudentOrder;

public class CityRegisterValidator {
    public String hostname;
    public String login;
    private String password;
    private CityRegisterCheсker personCheker;

    public CityRegisterValidator() {
        personCheker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        personCheker.checkPerson(so.getHusband());
        personCheker.checkPerson(so.getWife());
        personCheker.checkPerson(so.getChild());

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
