package com.clouway.collection;


import com.clouway.exception.Interval;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-8.
 */
public class PageBeanMain {
  public static void main(String[] args) {
    List<Integer> elementList = new ArrayList<>();

    elementList.add(1);
    elementList.add(2);
    elementList.add(3);
    elementList.add(4);
    elementList.add(5);
//    listMessage.add(6);
//    listMessage.add("7");
//    listMessage.add("8");
//    listMessage.add("9");
//    listMessage.add("10");
//    listMessage.add("11");
//    listMessage.add("12");
//    listMessage.add("13");
//    listMessage.add("14");
//    listMessage.add("15");

    PageBean pageList = new PageBean(elementList, 2);



    System.out.println("Traversing from first to last page");

    List<Integer> currentPage = pageList.firstPage();
    System.out.println("The current page number is <> " + pageList.getCurrentPageNumber());
    System.out.println("The current page elements are <> " + currentPage.toString());
    System.out.println("Is there a next page <> " + pageList.hasNext());
    System.out.println("Is there a previous page <> " + pageList.hasPrevious());
    while (pageList.hasNext()){
      currentPage = pageList.next();
      System.out.println("\nThe current page number is <> " + pageList.getCurrentPageNumber());
      System.out.println("The current page elements are <> " + currentPage.toString());
      System.out.println("Is there a next page <> " + pageList.hasNext());
      System.out.println("Is there a previous page <> " + pageList.hasPrevious());
    }

    System.out.println("\nTraversing from last to first page");
    currentPage = pageList.lastPage();
    System.out.println("The current page number is <> " + pageList.getCurrentPageNumber());
    System.out.println("The current page elements are <> " + currentPage.toString());
    System.out.println("Is there a next page <> " + pageList.hasNext());
    System.out.println("Is there a previous page <> " + pageList.hasPrevious());
    while (pageList.hasPrevious()){
      currentPage = pageList.previous();
      System.out.println("\nThe current page number is <> " + pageList.getCurrentPageNumber());
      System.out.println("The current page elements are <> " + currentPage.toString());
      System.out.println("Is there a next page <> " + pageList.hasNext());
      System.out.println("Is there a previous page <> " + pageList.hasPrevious());
    }
  }
}





