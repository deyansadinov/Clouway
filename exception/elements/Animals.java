package com.clouway.exception.elements;

/**
 * Created by clouway on 14-9-19.
 */
public class Animals {
  String name;

  public Animals(String name) {
    this.name = name;
  }

  public String toString(){
    return "Animal - "  + name;
  }
}
