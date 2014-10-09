package com.clouway.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-8.
 */
public class PageBean {

  private int pageSize ;
  private int fromIndex = 0;
  private int toIndex = 0;
  private List<String> elements;
  private int numberOfPage = 0;

  public PageBean(List<String> listOfPages, int pageSize) {
    this.elements = listOfPages;
    this.pageSize = pageSize;

  }

  /**
   * Go to the next page.If there is no page return error message
   *
   * @return
   */

  public List<Object> next() {
    List<Object> next = new ArrayList<>();

    if (toIndex + pageSize > elements.size()) {
      System.out.println(elements.get(toIndex));
    } else {
      for (Object o : elements.subList(fromIndex,maxSize())){
        next.add(o);
      }
    }
    fromIndex += pageSize;
    toIndex += pageSize;
    numberOfPage++;
    return next;
  }

  /**
   * Go to the previous page.If there is no page display message
   *
   * @return
   */

  public List<Object> previous(){
    List<Object> previous = new ArrayList<>();
    fromIndex -= pageSize;
    for (Object o : elements.subList(fromIndex,maxSize())) {
      System.out.println(o);
    }
    toIndex -= pageSize;
    numberOfPage--;
    return previous;
  }


  /**
   * Check if there is next element
   *
   * @return true if there is next page and false if there is no page
   */
  public boolean hasNext() {
    return (fromIndex + toIndex) < elements.size();
  }

  /**
   * Check if there is previous element
   *
   * @return true if there is previous page and false if there is no page
   */
  public boolean hasPrevious() {
    return (toIndex != pageSize) ? true : false;
//    for (ListIterator it = elements.listIterator(toIndex); it.hasPrevious(); ) {
//      if (it.hasPrevious()) {
//        return true;
//      }
//    }
//    return false;
  }


  /**
   * Go to the first page and make it current
   *
   * @return
   */
  public void firstPage() {
    fromIndex = 0;
    toIndex = pageSize;
    numberOfPage = 1;


  }

  /**
   * Go to the last page and make it current
   *
   * @return
   */
  public void lastPage() {
    fromIndex = elements.size() - (elements.size() % pageSize);
    toIndex = elements.size();
    numberOfPage = (fromIndex / pageSize);


  }

  /**
   * Show the number of the current page
   *
   * @return the number of the page
   */
  public int getCurrentPageNumber() {
    if (numberOfPage <= elements.size() / pageSize) {
      return numberOfPage;
    }
    return numberOfPage;
  }

  /**
   * Check toIndex is greater than the size of the list
   *
   * @return toIndex if it is less than the size of the list
   * or return the size of the list
   */
  private int maxSize() {
    return toIndex > elements.size() ? elements.size() : toIndex;
  }



}
