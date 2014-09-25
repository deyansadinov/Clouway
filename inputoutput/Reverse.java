package com.clouway.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by clouway on 14-9-25.
 */
public class Reverse {

  String text = "";

  public void reverse(String fileName) throws IOException {
    String buffer = readFile(fileName);
    reverseText(buffer);
  }

  public String readFile(String fileName) throws IOException {
    File file = new File(fileName);
    BufferedReader bf = new BufferedReader(new FileReader(file));

    String txt;
    while ((txt = bf.readLine())!=null){
      text+=txt;
    }
    return text;
  }
  public void reverseText(String text){
    String reversedText = "";
    String[] todo =text.split("");
    for (int i = 0; i < todo.length; i++) {
      reversedText = todo[todo.length-i-1];

    }
  }
}
