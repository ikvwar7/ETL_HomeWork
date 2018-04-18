package ru.liga.domain;

public class Suv {
    private String vin;
    private Integer milage;
    private String location;
    private Integer price;

    public Suv() {
    }

    public Suv(String vin, Integer milage, String location, Integer price) {
        this.vin = vin;
        this.milage = milage;
        this.location = location;
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public Integer getMilage() {
        return milage;
    }

    public String getLocation() {
        return location;
    }

    public Integer getPrice() {
        return price;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setMilage(Integer milage) {
        this.milage = milage;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
