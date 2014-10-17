package com.clouway.test;

import java.util.Arrays;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Array {

  private final int[] array;

  public Array(int[] array) {
    this.array = array;
  }


  /**
   * Print the array
   */

  public void printArray() {
    for (int anArray : array) {
      System.out.println(anArray);
    }
  }

  /**
   * get Minimal Element of the array
   */
  public int getMinElement() {
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
      if (min > array[i]) {
        min = array[i];
      }
    }
    return min;
  }

  /**
   * Get the sum of the array
   */
  public int getSum() {
    int sum = 0;
    for (int x : array) {
      sum = sum + x;
    }
    return sum;
  }
}
