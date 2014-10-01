package com.clouway.inputoutput;

import java.io.IOException;

/**
 * Created by clouway on 14-9-24.
 */
public class ReadMain {
  public static void main(String[] args) throws IOException {
    Reader reader = new Reader();
    System.out.println("PLease enter a symbol for breaking point ");
    System.out.println("Please enter a name for the file");
    System.out.println("Please enter some text");
    reader.read();
  }
}
