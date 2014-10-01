package com.clouway.inputoutput;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-9-26.
 */
public class TransferObjectMain {
  public static void main(String[] args) throws IOException {
    TransferObject transferObject = new TransferObject();
    FileInputStream in = null;
    FileOutputStream out = null;

    try {
      in = new FileInputStream("file.txt");
      out = new FileOutputStream("text2.txt");
      System.out.println("The number of the transferred bytes is : " + transferObject.transfer(in, out, -1, 10));
    } catch (IllegalArgumentException e) {
      System.out.println("The offset is not a negative number and numberOfBytes is not less then -1");
    } finally {
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
  }
}
