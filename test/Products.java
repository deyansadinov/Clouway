package com.clouway.test;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Products {

  private final String name;
  private final double price;
  private int currentQuantity;
  private int maxQuantity;


  public Products(String name, double price, int currentQuantity, int maxQuantity ) {
    this.name = name;
    this.price = price;
    this.currentQuantity = currentQuantity;
    this.maxQuantity = maxQuantity;
  }

  public int getMaxQuantity(int quantity ) {
    if (currentQuantity + quantity > maxQuantity){
      throw new StoreProblemException();
    }
    return currentQuantity + quantity ;
  }

  public String getName() {
    return name;
  }

  public int getCurrentQuantity(int quantity){
    if (currentQuantity  - quantity < 0){
      throw new StoreProblemException();
    }
    return currentQuantity - quantity ;
  }

  public double getPrice() {
    return price;
  }


}
