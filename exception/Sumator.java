package com.clouway.exception;

/**
 * Created by clouway on 14-9-19.
 */
public class Sumator {
  /**
   * @param a - string
   * @param b - string
   * @return - integer
   */

  public int sum(String a, String b) {
    try {
      return Integer.parseInt(a) + Integer.parseInt(b);
    } catch (NumberFormatException e) {
      throw new NumberErrorException();
    }

  }
}


