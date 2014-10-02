package com.clouway.inputoutput;


import java.io.*;
import java.util.Scanner;

/**
 * Created by clouway on 14-9-24.
 */

//. Да се направи приложение, който чете текст от конзолата и записва въведеното в текстов файл.

//Четенето спира при въвеждане на ред съдържащ само една точка ".". В началото да се указва името на създавания файл.

public class TextSaver {

  private Scanner scan = new Scanner(System.in);

//  public TextSaver(InputStream in) {
//    this.scan = new Scanner(in);
//  }

  public  void writeText() throws IOException {
    Writer writer = null;
    String br = scan.nextLine();
    String fileName = scan.nextLine();

    try{
      writer = new BufferedWriter(new FileWriter(fileName,true));

      String text;
      while (!(text = scan.nextLine()).equals(br)){

        writer.append("\n").write(text);
      }
    }
    finally {
      if (writer != null) {
        writer.close();
      }
        if (scan != null){
          scan.close();
        }

    }
  }





}
