package com.clouway.task2;

/**
 * Created by clouway on 14-9-11.
 */
public class Car {


    public int dateGreate;
    public int maxSpeed;
    public String color;


    public Car(String color, int maxSpeed, int dateGreate) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.dateGreate = dateGreate;

    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getDateGreate() {
        return dateGreate;
    }


    public static void main(String[] args) {

        Mercedes car1 = new Mercedes("black", 120, 2000);
        System.out.println(car1);
        VW car2 = new VW("white", 110, 1999);
        System.out.println(car2.getColor() + " " + car2.getMaxSpeed() + " " + car2.getDateGreate());
        Opel car3 = new Opel("green", 130, 1994, 12.5646, 4);
        System.out.println(car3.getColor() + " " + car3.getMaxSpeed() + " " + car3.getDateGreate() + " " + car3.getWight() + " " + car3.getPeople());

    }
}


