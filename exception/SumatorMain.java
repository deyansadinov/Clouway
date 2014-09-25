package com.clouway.exception;

/**
 * Created by clouway on 14-9-19.
 */


public class SumatorMain {


  public static void main(String[] args) {
    Sumator calc = new Sumator();
    try {
      System.out.println(calc.sum("7a", "17"));
     // throw new NumberFormatException();
    } catch (NumberErrorException e) {
      System.out.println(e.toString() + " : You must enter only numbers");

    }

  }
}

