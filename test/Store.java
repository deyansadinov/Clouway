package com.clouway.test;

import java.util.HashMap;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Store {

  HashMap<String, Products> storeHolder = new HashMap<>();

  public int sell(String name, int quantity) {
    if (storeHolder.size() == 0) {
      throw new StoreProblemException();
    }
    if (storeHolder.get(name) == null) {
      throw new StoreProblemException();
    }
    Products products = storeHolder.get(name);
    return products.getCurrentQuantity(quantity);
  }

  public Products addNewProduct(String name, Products products) {
    storeHolder.put(name, products);
    return storeHolder.get(name);
  }


//  private class ProductSlot {
//    private final Products products;
//    private  int currentQuantity;
//    private final int maxQuantity;
//
//    private ProductSlot(Products products,int currentQuantity,int maxQuantity) {
//
//      this.products = products;
//      this.currentQuantity = currentQuantity;
//      this.maxQuantity = maxQuantity;
//    }
//
//    public int getMaxQuantity() {
//      return maxQuantity;
//    }
//
//    public int getCurrentQuantity() {
//      return currentQuantity;
//    }
//  }
}
