package edu.javacourse.studentorder.domain;

public class Adress {
    private String postcode;
    private String street;
    private String building;
    private String extension;
    private String apartment;

    public Adress(String postcode, String street, String building, String extension, String apartment) {
        this.postcode = postcode;
        this.street = street;
        this.building = building;
        this.extension = extension;
        this.apartment = apartment;
    }
}
