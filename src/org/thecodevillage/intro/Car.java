package org.thecodevillage.intro;

/**
 * Created by Elkibet on 9/17/2017.
 */
public class Car {

    private String name;

    private int noOfWheels;

    private String color;

    private int mileage;

    private double amount;


    public Car(){

    }

    public Car(String name,String color){
        this.name = name;
        this.color = color;
    }

    public Car(String name, int noOfWheels, String color, int mileage, double amount) {
        this.name = name;
        this.noOfWheels = noOfWheels;
        this.color = color;
        this.mileage = mileage;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
