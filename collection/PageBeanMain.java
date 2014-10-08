package com.clouway.collection;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-8.
 */
public class PageBeanMain {

  private static final String BREAK_POINT = ";";
  private static final String NEXT = "next";
  private static final String PREVIOUS = "previous";

  public static void main(String[] args) {
    List<String> listMessage = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a page size");
    int pageSize = Integer.parseInt(scanner.nextLine());

    Page page;

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

    PageBean pageList = new PageBean(listMessage, pageSize);

    System.out.println("The current page is " + pageList.getCurrentPageNumber());
    System.out.println("Is there a next element <> " + pageList.hasNext());
    System.out.println("Is there a previous element <> " + pageList.hasPrevious());
    System.out.println();

    System.out.println("Enter \"next\" to display the first page ");
    String line;
    while (!(line = scanner.nextLine()).equals(BREAK_POINT)) {
      if (line.equals(NEXT)) {
        try {
         // System.out.println("The first page is " + pageList.firstPage());
          System.out.println("Is there a next element <> " + pageList.hasNext());
          System.out.println("Is there a previous element <> " + pageList.hasPrevious());
        //  System.out.println("The last page is " + pageList.lastPage());
          page = pageList.next();
          page.pagePrint();
        } catch (RuntimeException e) {
          System.out.println("There are no more pages");
        }
      } else {
        if (line.equals(PREVIOUS)) {
          try {
           // System.out.println("The first page is " + pageList.firstPage());
            System.out.println("Is there a next element <> " + pageList.hasNext());
            System.out.println("Is there a previous element <> " + pageList.hasPrevious());
           // System.out.println("The last page is " + pageList.lastPage());
            page = pageList.previous();
            page.pagePrint();
          } catch (RuntimeException ex) {
            System.out.println("There are no previous pages");
          }
        }
      }
    }
    scanner.close();
  }
}


