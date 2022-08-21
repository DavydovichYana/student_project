package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.CityRegisterChekerResponse;
import edu.javacourse.studentorder.domain.Person;

public interface CityRegisterCheсker {
    CityRegisterChekerResponse checkPerson(Person person);
}
