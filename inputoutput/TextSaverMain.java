package com.clouway.inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by clouway on 14-9-24.
 */
public class TextSaverMain {
  public static void main(String[] args) throws IOException {
//    InputStream in = new FileInputStream("dido.txt");
//    InputStream in2 = System.in;

    TextSaver reader = new TextSaver();
    System.out.println("PLease enter a symbol for breaking point ");
    System.out.println("Please enter a name for the file");
    System.out.println("Please enter some text");
    reader.writeText();
  }
}
