package com.clouway.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by clouway on 14-9-24.
 */
public class ConsoleMain {
  public static void main(String[] args) throws FileNotFoundException {
    InputStream in = new FileInputStream("consolefile.txt");

    Console con = new Console(in);

    System.out.println("Please enter an integer");
    int num = con.readInt();
    System.out.println(num);

    System.out.println("PLease enter a string");
    String str = con.readString();
    System.out.println(str);

    System.out.println("Please enter a char");
    char c = con.readChar();
    System.out.println(c);

    System.out.println("Please enter a float number");
    float fl = con.readFloat();
    System.out.println(fl);

  }
}
