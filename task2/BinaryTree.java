package com.clouway.task2;

/**
 * Created by clouway on 14-9-15.
 */
public class BinaryTree {


  public static void main(String[] args) {

    Tree theTree = new Tree();

    theTree.addNode(23);
    theTree.addNode(12);
    theTree.addNode(45);
    theTree.addNode(22);
    theTree.addNode(24);
    theTree.addNode(24);

    System.out.println("This is In other traverse tree");
    theTree.print();
    System.out.println("This is Pre other traverse tree");
    theTree.print1();

    theTree.search(45);
    System.out.println("the key is found");
  }


}
