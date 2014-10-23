package com.clouway.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Store {

  protected HashMap<String, Products> storeHolder = new HashMap<>();
  private Comparator<Products> byPrice;

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

//  public void sort(SortByPrice sortByPrice) {
//    List<Products> productList = new ArrayList<>(storeHolder.values());
//    for (Products x : productList){
//      productList.add(x.getProduct());
//    }
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

