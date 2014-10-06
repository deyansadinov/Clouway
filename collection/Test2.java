package com.clouway.collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-6.
 */

class Person {
  private int id;
  private String name;

  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return "{ID is :"+id + "; name is : " + name + "}";

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    if (id != person.id) return false;
    if (name != null ? !name.equals(person.name) : person.name != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }
}


public class Test2 {
  public static void main(String[] args) {
    Person p1 = new Person(0, "Dido");
    Person p2 = new Person(1,"bob");
    Person p3 = new Person(2,"max");
    Person p4 = new Person(1,"bob");
    Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

    map.put(p1, 1);
    map.put(p2, 2);
    map.put(p3, 3);
    map.put(p4, 1);

    for (Person key : map.keySet()) {
      System.out.println(key + " : " + map.get(key));
    }

    Set<Person> set = new LinkedHashSet<Person>();

    set.add(p1);
    set.add(p2);
    set.add(p3);
    set.add(p4);

    System.out.println(set);
  }
}
