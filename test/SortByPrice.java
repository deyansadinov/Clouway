package com.clouway.test;

import java.util.Comparator;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class SortByPrice implements Comparator<Product2> {

  @Override
  public int compare(Product2 product1, Product2 product2) {
    return product1.getPrice().compareTo(product2.getPrice());
  }
}
