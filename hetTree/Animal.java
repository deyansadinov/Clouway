package com.clouway.hetTree;

/**
 * Created by clouway on 14-9-16.
 */
public class Animal implements Comparable<Object> {
  private String name;
  private Integer age;

  public Animal(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  @Override
  public String toString(){
    return this.name + " <> " + this.age;
  }

  @Override
  public int compareTo(Object o) {
    Animal other = (Animal) o;
    return (this.name).compareTo(other.name);

  }
}
