package com.clouway.inputoutput;


import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 14-9-24.
 */
public class ReaderMain {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String breakPoint;
    String fileName;
    System.out.println("Please enter a symbol for breaking point");
    breakPoint = scanner.nextLine();
    System.out.println("Please enter a name for the file");
    fileName = scanner.nextLine();
    FileHandler consoleReader = new FileHandler();
    System.out.println("Please enter some text");
    boolean read = true;
    while (read){
      read = consoleReader.writeTextToBreakPoint(fileName,scanner.nextLine(),breakPoint);
    }
    scanner.close();
  }
}
