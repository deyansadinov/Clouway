package com.clouway.test;

import java.util.Comparator;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class SortByName implements Comparator<Product2> {
  @Override
  public int compare(Product2 product2, Product2 product22) {

    return product2.getName().compareTo(product22.getName());
  }
}
