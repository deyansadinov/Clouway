package com.clouway.collection;


import java.util.HashMap;
import java.util.Map;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-9.
 */
public class ExceptionsMessageManagerMain  {
  public static void main(String[] args) throws KeyDontExistsException {
//    Map<String,String> exception = new HashMap<>();
    ExceptionsMessageManager manager  = new ExceptionsMessageManager();


    try {
      manager.registerErrorMessage("1" , "Invalid debit card number" );
      manager.registerErrorMessage("2" , "Wrong PIN");
      manager.registerErrorMessage("3" , "Invalid post code");
      manager.registerErrorMessage("4" , "Wrong card");
      manager.raiseError("2");
      manager.raiseError("4");
      manager.raiseError("1");
      System.out.println(manager.getErrorMessages());
    }catch (IllegalMessageException e) {
      e.getMessage();
    }
  }
}
