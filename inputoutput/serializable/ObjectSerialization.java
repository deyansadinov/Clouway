package com.clouway.inputoutput.serializable;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-2.
 */
public class ObjectSerialization {
  public static void main(String[] args) throws IOException {

    DataClass dataClass = new DataClass();
    Animal animal = new Animal("Sharo", 12.5f,7,"black");
    FileInputStream input = null;
    FileOutputStream output = null;

    try{
      input = new FileInputStream("animal.ser");
      output = new FileOutputStream("animal.ser");
      dataClass.saveObject(output,animal);
      animal =(Animal) dataClass.getObject(input);
      System.out.println(animal.toString());
    }catch (IOException e){
      e.printStackTrace();
    }finally {
      if (input != null){
        input.close();
      }
      if (output != null){
        output.close();
      }
    }

  }
}
