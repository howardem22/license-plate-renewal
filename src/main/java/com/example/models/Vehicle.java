package com.example.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Emily on 4/29/2017.
 */
@Entity
public class Vehicle {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String make;

    @NotNull
    @Size(min=3, max=15)
    private String model;

    @NotNull
    private String kindOfVehicle;


    public Vehicle() { }

    public Vehicle(String make, String model, String kindOfVehicle){
        this.make = make;
        this.model= model;
        this.kindOfVehicle= kindOfVehicle;
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return kindOfVehicle;
    }

    public void setTrim(String trim) {
        this.kindOfVehicle = trim;
    }

}
