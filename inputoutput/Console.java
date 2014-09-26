package com.clouway.inputoutput;

import java.util.Scanner;

/**
 * Created by clouway on 14-9-24.
 */

// Да се направи клас, който чете от конзолата. Трябва да има следните методи:
public class Console {

  private Scanner scr = new Scanner(System.in);

  public String readString() {
    return scr.next();
  }

  public int readInt() {
    return scr.nextInt();
  }

  public char readChar() {
    return scr.next().charAt(0);
  }

  public float readFloat() {
    return scr.nextFloat();
  }
}
