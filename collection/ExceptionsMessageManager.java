package com.clouway.collection;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.Collections;
import java.util.Map;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-9.
 */
public class ExceptionsMessageManager {

  private Map<String , String> exceptionMessage;
  private StringBuilder message = new StringBuilder();

  public ExceptionsMessageManager(Map<String, String> exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
  }

  public void registerErrorMessage(String messageCode, String message) throws IllegalMessageException {
    if (exceptionMessage.containsValue(message)){
      throw new IllegalMessageException("There is value with some message");
    }
    exceptionMessage.put(messageCode,message);
  }

  public String raiseError(String messageCode){
    if (exceptionMessage.containsKey(messageCode)){
      message.append(exceptionMessage.get(messageCode));
    }else {
      throw new KeyAlreadyExistsException("Message with that key already exist");
    }
    return message.toString();
  }

  public String getErrorMessages(){
    return String.valueOf(exceptionMessage.values());
  }
}
