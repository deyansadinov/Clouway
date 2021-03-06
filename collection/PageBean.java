package com.clouway.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-8.
 */
public class PageBean {

  private int pageSize;
  //  private int index = 0;
  private List<Integer> elements;
  private int pageNumber = 0;

  public PageBean(List<Integer> elements, int pageSize) {
    this.elements = elements;
    this.pageSize = pageSize;

  }

  /**
   * Show the current page number
   *
   * @return
   */
  public int getCurrentPageNumber() {
    return pageNumber;
  }

  /**
   * Calculates total page number
   *
   * @return
   */
  private int getLastPageNumber() {
//    return (int) Math.ceil(elements.size() / pageSize);
    return elements.size() / pageSize + ((elements.size() % pageSize != 0) ? 1 : 0);

  }

  /**
   * @return subList of the this.elements ArrayList
   */
  public List<Integer> currentPage() {
//    ArrayList<Integer> currentPage = new ArrayList<Integer>();
    return elements.subList(getFirstIndex(), getLastIndex());
//       currentPage.add(e);

    //return currentPage;
  }

  /**
   * @return return element first index of the current page
   */
  private int getFirstIndex() {
    return (pageNumber - 1) * pageSize;
  }

  /**
   * @return return element last index if the current page
   */
  private int getLastIndex() {
    int lastIndex = pageNumber * pageSize;
    return (lastIndex < elements.size()) ? lastIndex : elements.size();
  }

  /**
   * Go to the last page and make it current
   *
   * @return
   */
  public List<Integer> lastPage() {
    pageNumber = getLastPageNumber();
//    index = getFirstIndex();
    return currentPage();
  }

  /**
   * Go to the first page and make it current
   *
   * @return
   */
  public List<Integer> firstPage() {
    pageNumber = 1;
//    index = getFirstIndex();
    return currentPage();
  }

  /**
   * Check if there is next page
   *
   * @return true if there is next page and false if is no page
   */
  public boolean hasNext() {
    int nextPageNumber = pageNumber + 1;
    return (nextPageNumber <= getLastPageNumber());
  }

  /**
   * Check if there is previous page
   *
   * @return true if there is previous page and false if is no page
   */
  public boolean hasPrevious() {
    int previousPageNumber = pageNumber - 1;
    return (previousPageNumber >= 1);
  }

  /**
   * Go to the next page
   *
   * @return
   */
  public List<Integer> next() {
    if (!hasNext()) {
      return null;
    }
    pageNumber++;
//    index = getFirstIndex();
    return currentPage();
  }

  /**
   * Go to the previous page
   *
   * @return
   */
  public List<Integer> previous() {
    if (!hasPrevious()) {
      return null;
    }
    pageNumber--;
//    index = getFirstIndex();
    return currentPage();
  }
}



