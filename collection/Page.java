package com.clouway.collection;

import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-8.
 */
public class Page {

  private int  pageNumber;
  private List<String> page;

  public Page(List<String> page,int numberOfPage) {
    this.pageNumber = numberOfPage;
    this.page = page;
  }

  /**
   * Print the content of the console
   */
  public void pagePrint(){
    System.out.println("page :" + pageNumber + ": ");
    for (String pageSize : page){
      System.out.println(pageSize);
    }
  }
}
