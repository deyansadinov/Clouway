package com.clouway.inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by clouway on 14-9-24.
 */
public class FileReaderMain {
  public static void main(String[] args) throws IOException {

    InputStream in = new FileInputStream("consolefile.txt");
    InputStream in2 = System.in;

    Reader con = new Reader(in2);

    System.out.println("Please enter an integer");
    System.out.println(con.readInt());

    System.out.println("PLease enter a string");
    System.out.println(con.readString());

    System.out.println("Please enter a char");
    System.out.println(con.readChar());

    System.out.println("Please enter a float number");
    System.out.println(con.readFloat());

    in.close();
  }
}
