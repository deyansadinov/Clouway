package com.clouway.exception;

/**
 * Created by clouway on 14-9-23.
 */
public class InvalidIntervalBoundsException extends Exception {
  public InvalidIntervalBoundsException(){
    super("The bounds of the interval are not valid,please try again");
  }
}
