package edu.javacourse.studentorder.validator.register;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.exception.TransportException;

public class FakeCityRegisterChecker implements CityRegisterCheсker {

    private static final String GOOD_1 = "1000";
    private static final String GOOD_2 = "2000";
    private static final String BAD_1 = "1001";
    private static final String BAD_2 = "2001";
    private static final String ERROR_1 = "4000";
    private static final String ERROR_2 = "5000";
    private static final String ERROR_T_1 = "4003";
    private static final String ERROR_T_2 = "5003";

    public CityRegisterResponse checkPerson(Person person) throws CityRegisterException, TransportException {

        CityRegisterResponse res = new CityRegisterResponse();

        if (person instanceof Adult) {
            System.out.println("Adult checking...");
            Adult ad = (Adult) person;
            String ps = ad.getPassportSeria();

            if (ad.getPassportSeria().equals(GOOD_1) || ad.getPassportSeria().equals(GOOD_2) ) {
                res.setExisting(true);
                res.setTemporal(false);
            }
            if (ad.getPassportSeria().equals(BAD_1) || ad.getPassportSeria().equals(BAD_2) ) {
                res.setExisting(false);
                CityRegisterException ex = new CityRegisterException("404", "Fake Error!!!" + ad.getPassportSeria());
                throw ex;
            }
            if (ps.equals(ERROR_1)||ps.equals(ERROR_2)) {
                CityRegisterException ex = new CityRegisterException("4000", "Fake Exception " + ps);
                throw ex;
            }
            if (ps.equals(ERROR_T_1)||ps.equals(ERROR_T_2)) {
                TransportException ex = new TransportException("Transport Exception " + ps);
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
