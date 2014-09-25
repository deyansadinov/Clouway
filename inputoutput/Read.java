package com.clouway.inputoutput;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by clouway on 14-9-24.
 */

//. Да се направи приложение, който чете текст от конзолата и записва въведеното в текстов файл.

//Четенето спира при въвеждане на ред съдържащ само една точка ".". В началото да се указва името на създавания файл.

public class Read {

  private Scanner scan = new Scanner(System.in);
  private String text;
  private PrintWriter outputStream;

  public void create() throws IOException {
    File file = new File("file.txt");
    if (file.createNewFile()){

      System.out.println("The file is created");
    }
  }
  public  void readFile() throws IOException {
    create();

    try{
      outputStream = new PrintWriter(new FileWriter("file.txt"));
      while (!(text = scan.nextLine()).equals(".")){
        outputStream.write(text);
      }
    }
    finally {
      if (outputStream != null){
        outputStream.close();
      }
    }
  }





}
