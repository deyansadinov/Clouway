package com.clouway.inputoutput;

import java.io.*;
import java.util.Scanner;

/**
 * Created by clouway on 14-9-25.
 */
public class TextReverse {

  /**
   *
   * @param fileName
   * @throws IOException
   */
  public void reverse(String fileName) throws IOException {
    Scanner scanner = new Scanner(new File(fileName));
    StringBuilder builder = new StringBuilder();
    while (scanner.hasNext()){
      builder.append("\n").append(scanner.nextLine());

    }
    FileWriter writer = new FileWriter(fileName);
    writer.write(builder.reverse().toString());
    writer.flush();
  }
}
