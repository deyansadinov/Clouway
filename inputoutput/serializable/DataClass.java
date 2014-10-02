package com.clouway.inputoutput.serializable;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-2.
 */
public class DataClass {


  public void saveObject(OutputStream out, Object o) throws IOException {

    ObjectOutputStream output = new ObjectOutputStream(out);
    output.writeObject(o);
    System.out.println("The data is saved to file animal.ser");

  }

  public Object getObject(InputStream in) throws IOException {
    Object object = null;
    try {
      ObjectInput input = new ObjectInputStream(in);
      object = input.readObject();
    } catch (ClassNotFoundException e) {
      System.out.println("Class not found");
      e.printStackTrace();
    }
    return object;
  }
}
