package com.clouway.inputoutput;

/**
 * Created by clouway on 14-9-24.
 */
public class ConsoleMain {
  public static void main(String[] args) {

    Console con = new Console();

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
