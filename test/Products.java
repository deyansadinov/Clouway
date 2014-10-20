package com.clouway.test;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Products implements Comparable<Products>   {
  private int maxValue;
  private Double price;
  private int currentValuue;

  public Products(int maxValue, double price) {
    this.maxValue = maxValue;
    this.price = price;
  }

  public int getMaxValue() {
    return maxValue;
  }

  public int getCurrentValuue() {
    return currentValuue;
  }

  public void setCurrentValuue(int currentValuue) {
    this.currentValuue = currentValuue;
  }

  @Override
  public int compareTo(Products o) {
    return this.price.compareTo(o.price);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Products products = (Products) o;

    if (maxValue != products.maxValue) return false;
    if (!price.equals(products.price)) return false;

    return true;
  }


}
