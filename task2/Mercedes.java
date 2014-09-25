package com.clouway.task2;

/**
 * Created by clouway on 14-9-11.
 */
public class Mercedes extends Car {


    public Mercedes(String color, int maxSpeed, int dateGreate) {
        super(color, maxSpeed, dateGreate);
    }
    public String toString(){
        return String.format("Mercedes max speed is : %s , color is %s , date is %s",this.getMaxSpeed(),this.getColor(),this.dateGreate);
    }
}
