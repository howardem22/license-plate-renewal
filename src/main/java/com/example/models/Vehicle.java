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

    @Size(min=3, max=15)
    private String trim;
    /**
    @NotNull
    private float liter;

    private int taxHp;


     * vehicle to engine cylinders
     *@ManyToOne
     * private Category category;
    **/

    public Vehicle() { }

    public Vehicle(String make, String model, String trim){
        this.make = make;
        this.model= model;
        this.trim= trim;
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
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

/**
    public float getLiter() {
        return liter;
    }

    public void setLiter(float liter) {
        this.liter = liter;
    }

    public int getTaxHp() {
        return taxHp;
    }

    public void setTaxHp(int taxHp) {
        this.taxHp = taxHp;
    }
 **/

}
