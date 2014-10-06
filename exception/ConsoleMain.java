package com.clouway.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by clouway on 14-9-19.
 */
public class ConsoleMain {


  public static void main(String[] args) throws InvalidIntervalBoundsException, NumberOutOfIntervalException {
    int startInterval;
    int endInterval;
    int number;
    Scanner scanner = new Scanner(System.in);
    try{
      System.out.println("Please enter a number fot start the interval");
      startInterval = scanner.nextInt();
      System.out.println("Please enter a number fot the end the interval");
      endInterval = scanner.nextInt();
      Interval interval = new Interval(startInterval,endInterval);
      System.out.println("please enter a number to be compared");
      number = scanner.nextInt();
      if (interval.contains(number)){
        System.out.println("The number is in the interval");
      }else {
        throw  new NumberOutOfIntervalException();
      }
    }catch (InputMismatchException e){
      System.out.println("The number you have entered is not in a valid integer,please try again");
    }catch (InvalidIntervalBoundsException e){
      System.out.println(e.getMessage());
    }finally {
      if (scanner != null){
        scanner.close();
      }
    }
  }
}