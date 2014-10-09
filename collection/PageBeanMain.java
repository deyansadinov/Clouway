package com.clouway.collection;


import com.clouway.exception.Interval;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-8.
 */
public class PageBeanMain {
  public static void main(String[] args) {
    List<String> listMessage = new ArrayList<>();

    listMessage.add("1");
    listMessage.add("2");
    listMessage.add("3");
    listMessage.add("4");
    listMessage.add("5");
    listMessage.add("6");
    listMessage.add("7");
    listMessage.add("8");
    listMessage.add("9");
    listMessage.add("10");
    listMessage.add("11");
    listMessage.add("12");
    listMessage.add("13");
    listMessage.add("14");
    listMessage.add("15");

    PageBean pageList = new PageBean(listMessage, 2);
    pageList.next();
    System.out.println("The current page is <> "+ pageList.getCurrentPageNumber());
    System.out.println("Is there a next page <> " +pageList.hasNext());
    System.out.println("Is there a previous page <> "+pageList.hasPrevious());
    System.out.println();

    pageList.next();
    System.out.println("The current page is <> "+ pageList.getCurrentPageNumber());
    System.out.println("Is there a next page <> " +pageList.hasNext());
    System.out.println("Is there a previous page <> "+pageList.hasPrevious());
    System.out.println();

    pageList.next();
    System.out.println("The current page is <> "+ pageList.getCurrentPageNumber());
    System.out.println("Is there a next page <> " +pageList.hasNext());
    System.out.println("Is there a previous page <> "+pageList.hasPrevious());
    System.out.println();

    pageList.previous();
    System.out.println("The current page is <> "+ pageList.getCurrentPageNumber());
    System.out.println("Is there a next page <> " +pageList.hasNext());
    System.out.println("Is there a previous page <> "+pageList.hasPrevious());
    System.out.println();

    pageList.firstPage();
    System.out.println("The first page is <> "+ pageList.getCurrentPageNumber());
    System.out.println("Is there a next page <> " +pageList.hasNext());
    System.out.println("Is there a previous page <> "+pageList.hasPrevious());
    System.out.println();

    pageList.lastPage();
    System.out.println("The last page is <> "+ pageList.getCurrentPageNumber());
    System.out.println("Is there a next page <> " +pageList.hasNext());
    System.out.println("Is there a previous page <> "+pageList.hasPrevious());


  }
}


