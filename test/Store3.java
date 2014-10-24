package com.clouway.test;

import com.sun.org.apache.xpath.internal.operations.*;

import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Store3 {
  Map<String, ProductSlot> productHolder = new HashMap<>();

  public int sell(String name, int quantity) {
    if (productHolder.size() == 0) {
      throw new EmptyStoreException();
    }
    if (productHolder.get(name) == null) {
      throw new NotExistingProductException();
    }
    ProductSlot temp = productHolder.get(name);
    if (temp.currentQuantity - quantity < 0) {
      throw new NotEnoughProductsException("abc");
    }
    return temp.currentQuantity - quantity;
  }

  public void addProduct(Product product, int maxQuantity, int currentQuantity) {

    productHolder.put(product.getName(), new ProductSlot(product, maxQuantity, currentQuantity));
    if (maxQuantity < currentQuantity) {
      throw new StoreProblemException();
    }
  }

  public int add(String name, int quantity) {
    ProductSlot temp = productHolder.get(name);
    if ((temp.currentQuantity + quantity) > temp.maxQuantity) {
      throw new StoreProblemException();
    }
    return temp.currentQuantity += quantity;
  }

  public List<Product> sort() {
    CompareByPrice compareByPrice = new CompareByPrice();
    List<Product> listProduct = new ArrayList<>();
    List<ProductSlot> list = new ArrayList<>(productHolder.values());
    for (ProductSlot productSlot: list){
      listProduct.add(productSlot.product);
    }Collections.sort(listProduct,compareByPrice);
    return listProduct;
  }


  private class ProductSlot {
    private final Product product;
    private final int maxQuantity;
    private int currentQuantity;

    private ProductSlot(Product product, int maxQuantity, int currentQuantity) {
      this.product = product;
      this.maxQuantity = maxQuantity;
      this.currentQuantity = currentQuantity;
    }
  }
}
