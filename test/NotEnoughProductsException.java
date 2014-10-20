package com.clouway.test;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class NotEnoughProductsException extends RuntimeException {
  public NotEnoughProductsException(String message) {
    super(message);
  }
}
