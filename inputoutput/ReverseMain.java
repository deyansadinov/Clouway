package com.clouway.inputoutput;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by clouway on 14-9-25.
 */
public class ReverseMain {
  public static void main(String[] args) throws IOException {
    Reverse rev = new Reverse();

    try {
      rev.reverse("file.txt");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
