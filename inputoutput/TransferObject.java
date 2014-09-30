package com.clouway.inputoutput;

import java.io.BufferedInputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-9-26.
 */
public class TransferObject {

  public void transfer(InputStream in, OutputStream out, int numberOfBytes, int offset) throws IOException {


    if (offset < 0 && numberOfBytes < -1) {
      throw new IllegalArgumentException();
    }
    byte[] buff = new byte[4];

    in.skip(offset);
    int readBytes;
    int byteN = 0;
    int length;
    if (numberOfBytes == -1) {
      while ((readBytes = in.read(buff)) != -1) {

        out.write(buff, 0, readBytes);
      }
    } else {
      while (((readBytes = in.read(buff)) != -1)) {

        if (readBytes < numberOfBytes) {
          out.write(buff, 0, readBytes);
          byteN += readBytes;
          if (byteN + buff.length > numberOfBytes) {
            length = numberOfBytes - byteN;
            in.read(buff, 0, length);
            out.write(buff, 0, length);
            byteN += length;
          }
          if (byteN == numberOfBytes) {
            return;
          }
        }
      }
      out.flush();
    }

  }
}

