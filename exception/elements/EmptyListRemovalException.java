package com.clouway.exception.elements;

/**
 * Created by clouway on 14-9-23.
 */
public class EmptyListRemovalException extends RuntimeException {
  public EmptyListRemovalException() {
    super("The roll is already empty");
  }
}
