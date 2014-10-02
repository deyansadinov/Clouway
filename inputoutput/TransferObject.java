package com.clouway.inputoutput;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.InputMismatchException;


/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-9-26.
 */
public class TransferObject {

  public int transfer(InputStream in, OutputStream out, int numberOfBytes, int offset) throws IOException {


    if (offset < 0 && numberOfBytes < -1) {
      throw new IllegalArgumentException();
    }

    byte[] buff = new byte[6];
//
    in.skip(offset);
    int readBytes = 0;
    int availableBytes = 0;
    int length;
    int counter = 0;
//
//    if (numberOfBytes == -1) {
//      while ((readBytes = in.read(buff)) != -1) {
//        out.write(buff, 0, readBytes);
//        counter += readBytes;
//      }
//
//    }
//    if (numberOfBytes != -1 && ((readBytes = in.read(buff)) != -1)) {
//      counter += readBytes;
//      if (readBytes == numberOfBytes) {
//        out.write(buff, 0, numberOfBytes);
//        return numberOfBytes;
//      }
//
//      if (readBytes > numberOfBytes) {
//        out.write(buff, 0, numberOfBytes);
//        return numberOfBytes;
//      }
//      //if (readBytes < numberOfBytes) {
//      else {
//        out.write(buff, 0, readBytes);
//        availableBytes += readBytes;
//        if (availableBytes + buff.length > numberOfBytes) {
//          length = numberOfBytes - availableBytes;
//          in.read(buff, 0, length);
//          out.write(buff, 0, length);
//          availableBytes += length;
//        }
//
//        if (availableBytes == numberOfBytes) {
//          return numberOfBytes;
//        }
//      }
//      out.flush();
//    }
//    return counter;
//    int size;
//    if (numberOfBytes >= 0) {
//      size = numberOfBytes;
//    } else {
//      size = 64;
//    }
//    byte[] buffer = new byte[size];
//    int total = 0;
//    in.skip(offset);
//    int readBytes;
//
//    while ((readBytes = in.read(buffer)) != -1) {
//      total += readBytes;
//      out.write(buffer, 0, readBytes);
//      if (numberOfBytes == readBytes) {
//        break;
//      }
//    }
//    return total;
    while ((readBytes = in.read(buff)) != -1){
    if (numberOfBytes == -1 || readBytes > numberOfBytes ){
      out.write(buff,0,readBytes);

      }

    }
    return numberOfBytes;
  }


}

