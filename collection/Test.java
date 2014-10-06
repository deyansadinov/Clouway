package com.clouway.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-6.
 */
public class Test {
  public static void main(String[] args) {
    //HashSet do not retain order
    //Set<String> set1 = new HashSet<String>();

    //HashLinked remember the order
    //Set<String> set1 = new LinkedHashSet<String>();

    //TreeSet sort in nature order
    Set<String> set1 = new TreeSet<String>();
    if (set1.isEmpty()) {
      System.out.println("Set is empty at start");
    }

    set1.add("dog");
    set1.add("cat");
    set1.add("bear");
    set1.add("mouse");
    set1.add("snake");

    System.out.println(set1);

    //Iteration
    for (String element : set1) {
      System.out.println(element);
    }
    //Does the set contains a given item?
    if (set1.contains("elefant")) {
      System.out.println("Contain elefant");
    }
    if (set1.contains("cat")) ;
    System.out.println("Contain cat");

    //Intersection
    Set<String> set2 = new TreeSet<String>();

    set2.add("dog");
    set2.add("cat");
    set2.add("giraffe");
    set2.add("ant");
    set2.add("monkey");

    Set<String>intersection = new HashSet<String>(set1);
    intersection.retainAll(set2);
    System.out.println(intersection);

    //Difference
    Set<String>difference = new HashSet<String>(set2);
    difference.removeAll(set1);
    System.out.println(difference);
  }
}
