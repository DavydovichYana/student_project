package edu.javacourse.studentorder.domain.register;

import edu.javacourse.studentorder.domain.Person;

public class AnswerCityRegisterItem {

    public enum CityStatus {
        YES, NO, ERROR;
    }

    public static class CityError {
        private String code;
        private String text;

        public CityError(String code, String text) {
            this.code = code;
            this.text = text;
        }

        public String getCode() {
            return code;
        }

        public String getText() {
            return text;
        }
    }

    private CityStatus status;
    private Person person;
    private CityError error;

    // without error
    public AnswerCityRegisterItem(CityStatus status, Person person) {
        this.status = status;
        this.person = person;
    }

    // with an error
    public AnswerCityRegisterItem(CityStatus status, Person person, CityError error) {
        this.status = status;
        this.person = person;
        this.error = error;
    }
}
