package com.clouway.inputoutput;

import java.util.Scanner;

/**
 * Created by clouway on 14-9-24.
 */

// Да се направи клас, който чете от конзолата. Трябва да има следните методи:
public class Console {

  private Scanner scr = new Scanner(System.in);

  public String readString() {
    String str = scr.next();
    return str;
  }

  public int readInt() {
    int num = scr.nextInt();
    scr.nextLine();
    return num;
  }

  public char readChar(){
    char ch = scr.next().charAt(0);
    return ch;
  }

  public float readFloat(){
    float fl = scr.nextFloat();
    return fl;
  }
}
