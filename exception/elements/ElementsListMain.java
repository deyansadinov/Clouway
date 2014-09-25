package com.clouway.exception.elements;



/**
 * Created by clouway on 14-9-23.
 */
public class ElementsListMain {
  public static void main(String[] args) {
    ElementsList list = new ElementsList(3);

    Animals a1 = new Animals("Sharo");
    Animals a2 = new Animals("Maks");
    Animals a3 = new Animals("Boiko");
    Animals a4 = new Animals("Sabko");
    try {
      list.add(a1);
      list.add(a2);
      list.add(a3);
      list.add(a4);
    } catch (RollFullException e) {
      System.out.println(e.toString());
    }

    list.printAllElements();



    try {
      list.remove();
    } catch (EmptyRollException e) {
      System.out.println(e.toString());
    }

    list.printAllElements();

  }
}
