package com.clouway.inputoutput;


import java.io.*;
import java.util.Scanner;

/**
 * Created by clouway on 14-9-24.
 */

//. Да се направи приложение, който чете текст от конзолата и записва въведеното в текстов файл.

//Четенето спира при въвеждане на ред съдържащ само една точка ".". В началото да се указва името на създавания файл.

public class FileHandler {

  public boolean writeTextToBreakPoint(String fileNam, String text, String breakPoint) throws IOException {
    FileWriter fileWriter = null;
    boolean textWritten = false;
    try{
      fileWriter = new FileWriter(fileNam,true);
      if (!(text.equals(breakPoint))){
        fileWriter.write(text);
        fileWriter.write("\n");
        textWritten = true;
      }
    }catch (IOException e){
      e.printStackTrace();
    }finally {
      if (fileWriter != null){
        fileWriter.close();
      }
    }
    return textWritten;
  }


}
