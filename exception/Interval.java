package com.clouway.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by clouway on 14-9-19.
 */
public class Interval {

  private  int startInterval;
  private  int endInterval;

  public Interval(int startInterval, int endInterval) throws InvalidIntervalBoundsException {
    if (startInterval > endInterval){
      throw new InvalidIntervalBoundsException();
    }
    this.startInterval = startInterval;
    this.endInterval = endInterval;
  }

  public boolean contains(int number){
    return (number >= startInterval && number <= endInterval);
  }
}
