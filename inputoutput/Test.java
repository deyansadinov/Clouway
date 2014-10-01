package com.clouway.inputoutput;

import java.io.*;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-1.
 */
public class Test {
  public static void main(String[] args) throws IOException {
    BufferedInputStream inputstream = null;
    BufferedOutputStream outputstream = null;

    try{
      inputstream = new BufferedInputStream(new FileInputStream("file.txt"));
      outputstream = new BufferedOutputStream(new FileOutputStream("text2.txt"));

      int c;
      while ((c = inputstream.read()) != -1){
        outputstream.write(c);
      }
    }finally {
      if (inputstream != null){
        inputstream.close();
      }
      if (outputstream != null){
        outputstream.close();
      }
    }

  }
}
