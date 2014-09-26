package com.clouway.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-9-26.
 */
public class TransferObjectMain {
  public static void main(String[] args) throws FileNotFoundException {

    TransferObject transferObject = new TransferObject();

    FileInputStream in  = new FileInputStream("text1");
    FileOutputStream out = new FileOutputStream("text2");


  }
}
