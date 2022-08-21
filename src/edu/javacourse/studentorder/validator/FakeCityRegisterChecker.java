package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.CityRegisterChekerResponse;
import edu.javacourse.studentorder.domain.Person;

public class FakeCityRegisterChecker implements CityRegisterCheсker {
    public CityRegisterChekerResponse checkPerson(Person person) {
        return null;
    }
}
