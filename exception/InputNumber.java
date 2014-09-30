package com.clouway.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by clouway on 14-9-19.
 */
public class InputNumber {

  public void readNumber() throws InvalidIntervalBoundsException {
     int intervalStart;
     int intervalEnd;
     int numb;

    do {
      Scanner src = new Scanner(System.in);
      try {
        System.out.println("Enter the number for the begin of the interval");
        intervalStart = src.nextInt();

        System.out.println("Enter the number for the end of the interval");
        intervalEnd = src.nextInt();

        if (intervalStart >= intervalEnd) {
          throw new InvalidIntervalBoundsException();
        }

        System.out.println("Enter number between " + intervalStart + " and " + intervalEnd);
        numb = src.nextInt();

        checkInterval(intervalStart, intervalEnd, numb);
        System.out.println("The Number you entered is valid");

        return;
      }catch (NumberOutOfBoundsException e){
        System.out.println(e.toString());
      }catch (InputMismatchException e){
        System.out.println("The number you have entered is not a valid integer , please try again");
      }catch (InvalidIntervalBoundsException e ){
        System.out.println(e.toString());
      }finally {
        src.close();
      }

    } while (true);
  }

  public void checkInterval(int intervalStart, int intervalEnd, int numb) {
    if (numb < intervalStart || numb > intervalEnd) {
      throw new NumberOutOfBoundsException();
    }
  }
}
