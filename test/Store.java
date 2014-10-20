package com.clouway.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Store {
  private List<Products>listOfProducts;

  public Store(List<Products> listOfProducts) {
    this.listOfProducts = listOfProducts;
  }

  /**
   * Adding products in the store.
   *
   * @param product  the type of products that are added.
   * @param quantity a quantity that is added
   * @return how products are available in the store.
   */
  public int add(Products product, int quantity) {
    areAddNewProductToStore(product,quantity);
    addProductInToStore(product);
    return product.getCurrentValuue();
  }

  /**
   * Adding new products to the store uf this product does not still exist
   * @param product the new product to add
   */
  private void addProductInToStore(Products product){
    listOfProducts.add(product);
  }

  /**
   * Check whether you add new products.
   *
   * @param product  type of the products that will add.
   * @param quantity a quantity that will add.
   * @return true if there is space in the store, and false if you do not.
   */
  private void areAddNewProductToStore(Products product , int quantity ){
    int tempVallueAfterAdded = product.getCurrentValuue() + quantity;
    if(tempVallueAfterAdded > product.getMaxValue()){
      throw new FullStoreException(String.format("Can not add %d items in the store,only %d available space",quantity,calculateEmptySpaceInStore(product)));
    }
    product.setCurrentValuue(tempVallueAfterAdded);
  }

  /**
   * Calculate how much empty space there is in the warehouse
   *
   * @param product the type of products you wont to store in.
   * @return empty space in the store
   */
  private int calculateEmptySpaceInStore(Products product) {
    return (product.getMaxValue() - product.getCurrentValuue());
  }

  /**
   * Sell products from store.
   *
   * @param product  the type of products that are sold.
   * @param quantity a quantity that is sold.
   * @return how many products are still available in the store.
   */
  public int sell(Products product, int quantity) {
    if (quantity > product.getCurrentValuue()){
      throw new NotEnoughProductsException(String.format("Can be sold total: %d",product.getCurrentValuue()));
    }
    return product.getCurrentValuue() - quantity;
  }

  public List<Products> sortProductsByPrice() {
    Collections.sort(listOfProducts);
    return listOfProducts;
  }
}
