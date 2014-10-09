package com.clouway.collection;

import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-8.
 */
public class Page {

  int pageNumber;
  List<String> page;

  public Page(List<String> page, int numberOfPage) {
    this.pageNumber = numberOfPage;
    this.page = page;
  }
}
