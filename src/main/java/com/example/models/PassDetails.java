package com.example.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Emily on 4/30/2017.
 */
public class PassDetails {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private int startYear;

    @NotNull
    private int endYear;

    @NotNull
    private float displacement;

    @NotNull
    private int cylinder;

    private int taxHP;



    public PassDetails() { }

    public PassDetails(int startYear, int endYear, float displacement, int cylinder, int taxHP){
        this.startYear = startYear;
        this.endYear= endYear;
        this.displacement= displacement;
        this.cylinder = cylinder;
        this.taxHP= taxHP;
    }



    public int getId() {
        return id;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getTaxHP() {
        return taxHP;
    }

    public void setTaxHP(int taxHP) {
        this.taxHP = taxHP;
    }
}
