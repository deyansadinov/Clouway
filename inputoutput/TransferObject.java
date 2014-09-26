package com.clouway.inputoutput;

import java.io.BufferedInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-9-26.
 */
public class TransferObject {



  public int transfer(InputStream in, OutputStream out, int numberOfBytes, int offset) throws IOException {

    BufferedInputStream bf = new BufferedInputStream(in);
    byte[] buffer = new byte[10];

    while (bf.read(buffer,0,in.available())!= -1){

      out.write(buffer,numberOfBytes,offset);
    }

    return 0;
  }
}
