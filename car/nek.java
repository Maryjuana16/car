/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

/**
 *
 * @author user
 */
public class nek {

    private String make;
    private String model;
    private int year;

    public nek(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void printDetails() {
        System.out.println("Car details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public String getMake() {
        return make;
    }

    public void getmake() {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void getmodel() {
        this.model = model;
    }

    public int getyear() {
        return year;
    }

    public void setyear() {
        this.year = year;
    }

}
