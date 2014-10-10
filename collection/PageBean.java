package com.clouway.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-8.
 */
public class PageBean {

  private int pageSize;
  private int index = 0;

  private List<Integer> elements;
  private int numberOfPage = 0;

  public PageBean(List<Integer> elements, int pageSize) {
    this.elements = elements;
    this.pageSize = pageSize;

  }

  /**
   * Go to the next page.If there is no page return error message
   *
   * @return
   */

  public List<Object> next() {
    List<Object> next = new ArrayList<>();
    //Check to see end of book
    int ednIndex = index + pageSize;
    if (ednIndex > elements.size()) {
      ednIndex = elements.size();
      for (Object o : elements.subList(index, ednIndex)) {
        next.add(o);
      }
      return next;
    }

    for (Object o : elements.subList(index, ednIndex)) {
      next.add(o);
    }
    index += pageSize;
    numberOfPage++;
    return next;
  }

  /**
   * Go to the previous page.If there is no page display message
   *
   * @return
   */
  public List<Object> previous() {
    List<Object> previous = new ArrayList<>();
    index -= pageSize;
    int endIndex = index + pageSize;
    if (endIndex > elements.size()) {
      endIndex = elements.size();
      for (Object o : elements.subList(index, endIndex)) {
        previous.add(o);
      }
      return previous;
    }
    for (Object o : elements.subList(index, endIndex)) {
      previous.add(o);
    }
    numberOfPage--;
    return previous;
  }
//  public List<Object> previous() {
//    List<Object> output = new ArrayList<>();
//    index -= pageSize * 2;
//    for (Object d : elements.subList(index, index + pageSize)) {
//      output.add(d);
//    }
//    index += pageSize;
//    System.out.println();
//    if (index < 0) {
//      throw new IndexOutOfBoundsException();
//    }
//    pageNumber--;
//    return output;
//  }


  /**
   * Check if there is next element
   *
   * @return true if there is next page and false if there is no page
   */
  public boolean hasNext() {
    if (index <= elements.size() / pageSize) {
      return true;
    }
    return false;
  }

  /**
   * Check if there is previous element
   *
   * @return true if there is previous page and false if there is no page
   */
  public boolean hasPrevious() {
    return (index >= pageSize);

  }


  /**
   * Go to the first page and make it current
   *
   * @return
   */
  public int firstPage() {
    index = 1;
    return numberOfPage = 1;

  }

  /**
   * Go to the last page and make it current
   *
   * @return
   */
  public void lastPage() {
    index = elements.size() + ((elements.size() % pageSize));

    numberOfPage = (index / pageSize);


  }

  /**
   * Show the number of the current page
   *
   * @return the number of the page
   */
  public int getCurrentPageNumber() {
    return numberOfPage;
  }


}



