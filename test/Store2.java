package com.clouway.test;

import java.util.ArrayList;
import java.util.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Store2 {
  private HashMap<String, ProductSlot> storeHolder = new HashMap<>();

  public int sell(String name, int quantity) {
    if (storeHolder.size() == 0) {
      throw new StoreProblemException();
    }
    if (storeHolder.get(name) == null) {
      throw new StoreProblemException();
    }

    ProductSlot product = storeHolder.get(name);
    return product.sell(quantity);
  }

  public void addProduct(Product2 product, int maxQuantity, int currentQuantity) {
    storeHolder.put(product.getName(), new ProductSlot(product, maxQuantity, currentQuantity));
  }

  public Integer addToProduct(String name, int quantity) {
    ProductSlot productSlot = storeHolder.get(name);
    return productSlot.add(quantity);
  }

  public void sellOrder(OrderList orderList){
   Map<String,Integer> orders = orderList.getOrder();
    for (Entry<String,Integer> entry : orders.entrySet()  ){
      String productName = entry.getKey();
      int quantity = entry.getValue();
      sell(productName,quantity);
    }
  }

  public void addToOrder(OrderList myList) {
    Map<String,Integer> orders = myList.getOrder();
    for (Entry<String,Integer> entry : orders.entrySet()  ){
      String productName = entry.getKey();
      int quantity = entry.getValue();
      addToProduct(productName,quantity);
    }
  }

  public List<Product2> sort(SortByPrice sortByPrice) {
    List<Product2> listProduct = new ArrayList<>();
    List<ProductSlot> list = new ArrayList<>(storeHolder.values());
    for (ProductSlot a : list){
      listProduct.add(a.getProduct());
    }
    Collections.sort(listProduct,sortByPrice);
    return listProduct;
  }

  public List<Product2> sort2(SortByName sortByName) {
    List<Product2> listProduct2 = new ArrayList<>();
    List<ProductSlot> list = new ArrayList<>(storeHolder.values());
    for (ProductSlot a : list){
      listProduct2.add(a.getProduct());
    }
    Collections.sort(listProduct2,sortByName);
    return listProduct2;
  }


  private class ProductSlot {
    private final Product2 product;
    private final int maxQuantity;
    private   int currentQuantity;

    private ProductSlot(Product2 product, int maxQuantity, int currentQuantity) {
      this.product = product;
      this.maxQuantity = maxQuantity;
      this.currentQuantity = currentQuantity;
    }

    private int sell(int quantity) {
      if (currentQuantity - quantity < 0) {
        throw new StoreProblemException();
      }
      return  currentQuantity -= quantity;
    }

    private Integer add(int quantity) {
      if (currentQuantity + quantity > maxQuantity) {
        throw new StoreProblemException();
      }
      return currentQuantity += quantity;
    }

    private Product2 getProduct() {
      return product;
    }
  }
}
