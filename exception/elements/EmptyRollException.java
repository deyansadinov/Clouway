package com.clouway.exception.elements;

/**
 * Created by clouway on 14-9-23.
 */
public class EmptyRollException extends RuntimeException {
  public EmptyRollException() {
    super("The roll is already empty");
  }
}
