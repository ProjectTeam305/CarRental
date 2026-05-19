package com.example.business;

public class Car {
    String vin;
    Long licensePlate;
    String brand;
    String model;
    int year;
    String bodyType;      // Sedan, Hatchback, Pickup, SUV.
    int seats;
    double mileage;

    public Car(String vin, Long licensePlate, String brand, String model, int year, String bodyType, int seats, double mileage) {
        this.vin = vin;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.bodyType = bodyType;
        this.seats = seats;
        this.mileage = mileage;
    }
}
