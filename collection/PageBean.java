package com.clouway.collection;

import java.util.List;
import java.util.ListIterator;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-8.
 */
public class PageBean {

  private int pageSize;
  private int fromIndex = 0;
  private int toIndex = 0;
  private List<String> listOfPages;
  private List<String> page;
  private int numberOfPage = 0;

  public PageBean(List<String> listOfPages, int pageSize) {
    this.listOfPages = listOfPages;
    this.pageSize = pageSize;
    this.fromIndex -= pageSize;
  }

  /**
   * Go to the next page.If there is no page return error message
   * @return
   */
  public Page next(){
    if (toIndex < listOfPages.size()){
      fromIndex += pageSize;
      toIndex += pageSize;
      numberOfPage++;
      page = listOfPages.subList(fromIndex,maxSize());
    }else{
      throw new RuntimeException("There is no next page");
    }
    return new Page(page,numberOfPage);
  }

  /**
   * Go to the previous page.If there is no page display message
   * @return
   */
  public Page previous(){
    if (toIndex != pageSize){
      fromIndex -= pageSize;
      toIndex -= pageSize;
      numberOfPage--;
      page = listOfPages.subList(fromIndex,maxSize());
    }else{
      throw new RuntimeException("There is no previous page");
    }
    return new Page(page,numberOfPage);
  }

  /**
   * Check if there is next element
   * @return true if there is next page and false if there is no page
   */
  public boolean hasNext(){
    return (toIndex != listOfPages.size() ) ? true : false;
  }

  /**
   * Check if there is previous element
   * @return true if there is previous page and false if there is no page
   */
  public boolean hasPrevious(){
    return (toIndex != pageSize)?true:false;

  }

  /**
   * Go to the first page and make it current
   * @return
   */
  public Page firstPage(){
    fromIndex = 0;
    toIndex = pageSize;
    numberOfPage = 1;
    page = listOfPages.subList(fromIndex,toIndex);
    return new Page(page,numberOfPage);
  }

  /**
   * Go to the last page and make it current
   * @return
   */
  public Page lastPage(){
    fromIndex = listOfPages.size() - (listOfPages.size() % pageSize);
    toIndex = listOfPages.size();
    numberOfPage = (fromIndex / pageSize);
    page = listOfPages.subList(fromIndex,toIndex);
    return new Page(page,numberOfPage);
  }

  /**
   * Show the number of the current page
   * @return the number of the page
   */
  public int getCurrentPageNumber(){
    return numberOfPage;
  }

  /**
   * Check toIndex is greater than the size of the list
   * @return toIndex if it is less than the size of the list
   * or return the size of the list
   */
  private int maxSize() {
    return toIndex > listOfPages.size() ? listOfPages.size() : toIndex;
  }

}
