package com.clouway.inputoutput;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-9-26.
 */
public class TransferObject {

  public int transfer(InputStream in, OutputStream out, int numberOfBytes, int offset) throws IOException {


    if (offset < 0 && numberOfBytes < -1) {
      throw new IllegalArgumentException();
    }

    byte[] buff = new byte[128];

    in.skip(offset);
    int readBytes;
    int availableBytes = 0;
    int length;
    int counter = 0;

    if (numberOfBytes == -1) {
      while ((readBytes = in.read(buff)) != -1) {
        out.write(buff, 0, readBytes);
        counter += readBytes;
      }

    } else {
      while (((readBytes = in.read(buff)) != -1)) {
        counter += readBytes;
        if (readBytes == numberOfBytes) {
          out.write(buff, 0, numberOfBytes);
          return numberOfBytes;
        }

        if (readBytes > numberOfBytes) {
          out.write(buff, 0, numberOfBytes);
          return numberOfBytes;
        }
        if (readBytes < numberOfBytes) {
          out.write(buff, 0, readBytes);
          availableBytes += readBytes;
          if (availableBytes + buff.length > numberOfBytes) {
            length = numberOfBytes - availableBytes;
            in.read(buff, 0, length);
            out.write(buff, 0, length);
            availableBytes += length;
          }

          if (availableBytes == numberOfBytes) {
            return numberOfBytes;
          }
        }
      }
      out.flush();
    }
    return counter;
  }
}

