package com.clouway.collection;


import java.util.HashMap;
import java.util.Map;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-9.
 */
public class ExceptionsMessageManagerMain  {
  public static void main(String[] args) {
    Map<String,String> exception = new HashMap<>();

    ExceptionsMessageManager manager  = new ExceptionsMessageManager(exception);

    try {
      manager.registerErrorMessage("1" , "Invalid debit card number" );
      manager.registerErrorMessage("2" , "Wrong PIN");
      manager.registerErrorMessage("3" , "Invalid post code");
      manager.registerErrorMessage("4" , "Wrong card");
      manager.raiseError("2");
      manager.raiseError("4");
     // System.out.println(manager.raiseError("2"));
      System.out.println(manager.getErrorMessages());
    }catch (IllegalMessageException e) {
      e.getMessage();
    }
  }
}
