package com.clouway.inputoutput;

import java.io.*;
import java.util.Scanner;

/**
 * Created by clouway on 14-9-25.
 */
public class Reverse {

  /**
   *
   * @param fileName
   * @throws IOException
   */


  public void reverse(String fileName) throws IOException {
    Scanner scaner = new Scanner(new File(fileName));
    StringBuilder bulder = new StringBuilder();
    while (scaner.hasNextLine()){
      bulder.append("\n").append(scaner.nextLine());

    }
    FileWriter writer = new FileWriter(fileName);
    writer.write(bulder.reverse().toString());
    writer.flush();
  }
}
