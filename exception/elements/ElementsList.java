package com.clouway.exception.elements;



/**
 * Created by clouway on 14-9-23.
 */
public class ElementsList {

  private int index ;
  private Object[] roll;

  public ElementsList(int i) {
    roll = new Object[i];
  }

  /**
   * Add element to the array
   *
   * @param obj
   * @throws RollFullException
   */

  public void add(Object obj) {
    if (roll.length == index) {
      throw new RollFullException();
    }
    roll[index] = obj;
    index++;
  }

  /**
   * Remove the last element of the roll
   * @throws com.clouway.exception.elements.EmptyRollException
   */


  public void remove() {
    if (index == 0) {
      throw new EmptyRollException();
    }
    roll[index - 1] = null;
    index--;
  }

  /**
   * Print all the elements of the roll
   */

  public void printAllElements() {
    for (int i = 0; i < roll.length; i++) {
      System.out.println(roll[i]);
    }
  }


}
