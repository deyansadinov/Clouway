package com.clouway.exception.elements;

/**
 * Created by clouway on 14-9-23.
 */
public class FullListException extends RuntimeException {
  public FullListException() {
    super("The roll is already full");
  }
}
