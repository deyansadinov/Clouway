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
   * Show the current page number
   * @return
   */
  public int getCurrentPageNumber(){
    return numberOfPage;
  }

  /**
   * Calculates total page number
   * @return
   */
  private int getLastPageNumber(){
    return elements.size() / pageSize + ((elements.size() % pageSize !=0) ? 1 : 0);
  }

  /**
   *
   * @return subList of the this.elements ArrayList
   */
  public List<Integer> currentPage(){
    ArrayList<Integer> currentPage = new ArrayList<Integer>();
    index = getCurrentPageFirstIndex();
    int currentPageLastIndex = getCurrentPageLastIndex();
    for (Integer integer : elements.subList(index, currentPageLastIndex)) {
      currentPage.add(integer);
    }
    return currentPage;
  }

  /**
   *
   * @return return element first index of the current page
   */
  public int getCurrentPageFirstIndex() {
    return (numberOfPage -1) * pageSize;
  }

  /**
   *
   * @return return element last index if the current page
   */
  private int getCurrentPageLastIndex(){
    int lastIndex = index + pageSize;
    int currentPageLastIndex = (lastIndex < elements.size())?lastIndex:elements.size();
    return currentPageLastIndex;
  }

  /**
   * Go to the last page and make it current
   *
   * @return
   */
  public List<Integer> lastPage(){
    numberOfPage = getLastPageNumber();
    index = getCurrentPageFirstIndex();
    return currentPage();
  }

  /**
   * Go to the first page and make it current
   *
   * @return
   */
  public List<Integer> firstPage(){
    numberOfPage = 1;
    index = getCurrentPageFirstIndex();
    return currentPage();
  }

  /**
   * Check if there is next page
   * @return true if there is next page and false if is no page
   */
  public boolean hasNext(){
    int nextPageNumber = numberOfPage + 1;
    return (nextPageNumber <= getLastPageNumber());
  }

  /**
   * Check if there is previous page
   * @return true if there is previous page and false if is no page
   */
  public boolean hasPrevious(){
    int previousPageNumber = numberOfPage - 1;
    return (previousPageNumber >= 1 );
  }

  /**
   * Go to the next page
   * @return
   */
  public List<Integer> next(){
    if (!hasNext()){
      return null;
    }
    numberOfPage++;
    index = getCurrentPageFirstIndex();
    return currentPage();
  }

  /**
   * Go to the previous page
   * @return
   */
  public List<Integer> previous(){
    if (!hasPrevious()){
      return null;
    }
    numberOfPage--;
    index = getCurrentPageFirstIndex();
    return currentPage();
  }
}



