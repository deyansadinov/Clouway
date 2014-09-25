package com.clouway.exception;

import java.util.Collections;

/**
 * Created by clouway on 14-9-19.
 */
public class NumberOutOfBoundsException extends RuntimeException {
  public NumberOutOfBoundsException(){
    super("The number is not in the interval , please try again");
  }


}
