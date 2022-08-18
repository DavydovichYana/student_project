package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.StudentOrder;

public class CityRegisterValidator {
    public String hostname;
    public String login;
    private String password;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("City Register is running: " + hostname +", " + login);
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
