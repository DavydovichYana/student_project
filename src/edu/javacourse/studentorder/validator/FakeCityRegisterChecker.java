package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.CityRegisterChekerResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterCheсker {
    public CityRegisterChekerResponse checkPerson(Person person) throws CityRegisterException {
        return null;
    }
}
