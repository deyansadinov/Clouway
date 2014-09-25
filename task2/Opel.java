package com.clouway.task2;

/**
 * Created by clouway on 14-9-11.
 */
public class Opel extends Car {

    double wight;
    int people;

    public Opel(String color, int maxSpeed, int dateGreate, double wight, int people) {
        super(color, maxSpeed, dateGreate);
        this.wight = wight;
        this.people = people;


    }

    public double getWight() {
        return wight;
    }



    public int getPeople() {
        return people;
    }



}
