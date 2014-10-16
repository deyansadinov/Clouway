package com.clouway.collection;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-9.
 */
public class ExceptionsMessageManager {

  private Map<String, String> exceptionMessage = new HashMap<>();

  //private StringBuilder message = new StringBuilder();

  ArrayList<String> list = new ArrayList<>();

//  public ExceptionsMessageManager(HashMap exceptionMessage) {
//    this.exceptionMessage = exceptionMessage;
//  }

  public void registerErrorMessage(String messageCode, String message) throws IllegalMessageException {
    if (exceptionMessage.containsValue(message)) {
      throw new IllegalMessageException("There is value with some message");
    }
    exceptionMessage.put(messageCode, message);
  }

  public String raiseError(String messageCode) throws KeyDontExistsException {
   if (exceptionMessage.containsKey(messageCode)) {
      list.add(exceptionMessage.get(messageCode));
    } else {
      throw new KeyDontExistsException("Message with that key don't exist");
    }
    return messageCode;
  }

  //  public List<String> getErrorMessages(){
//    return new ArrayList<String>(exceptionMessage.values());
//  }
  public List<String> getErrorMessages() {
    return list;
  }
}
