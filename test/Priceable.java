package com.clouway.test;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public interface Priceable extends Comparable<Priceable> {
  double getPrice();

  int getQuantity();
}
