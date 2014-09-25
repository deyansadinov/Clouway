package com.clouway.exception.elements;

/**
 * Created by clouway on 14-9-23.
 */
public class RollFullException extends RuntimeException {
  public RollFullException() {
    super("The roll is already full");
  }
}
