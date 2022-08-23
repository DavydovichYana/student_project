package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.CityRegisterChekerResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterCheсker {

    private static final String GOOD_1 = "1000";
    private static final String GOOD_2 = "2000";
    private static final String BAD_1 = "1001";
    private static final String BAD_2 = "2001";

    public CityRegisterChekerResponse checkPerson(Person person) throws CityRegisterException {

        CityRegisterChekerResponse res = new CityRegisterChekerResponse();

        if (person instanceof Adult) {
            System.out.println("Adult checking...");
            Adult ad = (Adult) person;
            if (ad.getPassportSeria().equals(GOOD_1) || ad.getPassportSeria().equals(GOOD_2) ) {
                res.setExisting(true);
                res.setTemporal(false);
            }
            if (ad.getPassportSeria().equals(BAD_1) || ad.getPassportSeria().equals(BAD_2) ) {
                res.setExisting(false);
                CityRegisterException ex = new CityRegisterException("Fake Error!!!" + ad.getPassportSeria());
                throw ex;
            }
        }

        if (person instanceof Child) {
            res.setTemporal(true);
            res.setExisting(true);
        }

        System.out.println(res);

        return res;
    }
}
