package com.clouway.inputoutput;


import java.io.*;
import java.util.Scanner;

/**
 * Created by clouway on 14-9-24.
 */

//. Да се направи приложение, който чете текст от конзолата и записва въведеното в текстов файл.

//Четенето спира при въвеждане на ред съдържащ само една точка ".". В началото да се указва името на създавания файл.

public class Reader {

  private Scanner scan = new Scanner(System.in);

  public  void readFile() throws IOException {
    Writer writer = null;
    try{
      writer = new BufferedWriter(new FileWriter("file.txt",true));

      String text;
      while (!(text = scan.nextLine()).equals(".")){
        writer.write(text);
      }
    }
    finally {
      if (writer != null){
        writer.close();
      }
    }
  }





}
