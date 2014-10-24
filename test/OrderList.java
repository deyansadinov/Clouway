package com.clouway.test;

import java.util.HashMap;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class OrderList {

  private HashMap<String,Integer> order = new HashMap<>();

  public void addOrder(String name, int quantity){
    order.put(name,quantity);

  }
  public HashMap<String,Integer> getOrder(){
    return order;
  }
}
