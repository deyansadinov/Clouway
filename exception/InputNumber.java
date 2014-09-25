package com.clouway.exception;

import java.util.Scanner;

/**
 * Created by clouway on 14-9-19.
 */
public class InputNumber {

  private int value;

  public InputNumber(int value) {
    this.value = value;
  }

  public void isInInterval(int intervalStart, int intervalEnd){
    if (this.value < intervalStart || this.value > intervalEnd){
      throw new NumberOutOfBoundsException();
    }
  }
}
