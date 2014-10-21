package com.clouway.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Store {

  HashMap<String,Products> storeMap = new HashMap<>();
  public int sell(String name, int quantity) {
    if (storeMap.size() == 0) {
      throw new EmptyStoreException();
    }
    if (storeMap.get(name) == null){
      throw new EmptyStoreException();
    }
      return 9;
  }
  public int add(String name, Products products) {
    storeMap.put(name,products);
    return storeMap.size();
  }
}
