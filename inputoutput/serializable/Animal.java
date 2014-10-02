package com.clouway.inputoutput.serializable;

import java.io.Serializable;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-2.
 */
public class Animal implements Serializable {

  private String name;
  private String color;
  private int age;
  private float weight;

  public Animal(String name, float weight, int age, String color) {
    this.name = name;
    this.weight = weight;
    this.age = age;
    this.color = color;
  }

  @Override
  public String toString() {
    return "Animal{" +
            "name='" + name + '\'' +
            ", color='" + color + '\'' +
            ", age=" + age +
            ", weight=" + weight +
            '}';
  }
}
