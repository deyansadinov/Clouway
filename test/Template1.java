package com.clouway.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Template1 {
  private Map<String,String>variables;
  private String templateText;

  public Template1(String templateText) {
    this.templateText = templateText;
    this.variables = new HashMap<String,String>();
  }

  public void set(String name, String value) {
    this.variables.put(name,value);
  }

  public String evaluate() {
    String result = templateText;
    for (Entry<String,String>entry : variables.entrySet()){
      String regex = "\\$\\{"+ entry.getKey() +"\\}";
      result = result.replaceAll(regex,entry.getValue());
    }
    return result;
  }
}
