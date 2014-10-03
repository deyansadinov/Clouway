package com.clouway.inputoutput;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by clouway on 14-9-24.
 */

// Да се направи клас, който чете от конзолата. Трябва да има следните методи:
public class Reader {


  private Scanner scanner;

  public Reader(InputStream in) {
    this.scanner = new Scanner(in);

  }

  public String readString() {
    return scanner.next();
  }

  public int readInt() {
    return scanner.nextInt();
  }

  public char readChar() {
    return scanner.next().charAt(0);
  }

  public float readFloat() {
    return scanner.nextFloat();

  }



}
