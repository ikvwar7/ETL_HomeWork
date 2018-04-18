package ru.liga.domain;

public class Truck {
    private String vin;
    private Integer milage;
    private String location;
    private Integer price;
    private Integer maxWeight;

    public Truck() {
    }

    public Truck(String vin, Integer milage, String location, Integer price, Integer maxWeight) {
        this.vin = vin;
        this.milage = milage;
        this.location = location;
        this.price = price;
        this.maxWeight = maxWeight;
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

    public Integer getMaxWeight() {
        return maxWeight;
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

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }
}
