package edu.javacourse.studentorder.validator.register;

import edu.javacourse.studentorder.domain.CityRegisterChekerResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;

public interface CityRegisterCheсker {
    CityRegisterChekerResponse checkPerson(Person person) throws CityRegisterException;
}
