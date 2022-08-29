package edu.javacourse.studentorder.domain;

public class Adress {
    private String postcode;
    private Street street;
    private String building;
    private String extension;
    private String apartment;

    public Adress(String postcode, Street street, String building, String extension, String apartment) {
        this.postcode = postcode;
        this.street = street;
        this.building = building;
        this.extension = extension;
        this.apartment = apartment;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
