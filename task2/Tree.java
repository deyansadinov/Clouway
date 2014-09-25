package com.clouway.task2;

//import javax.xml.soap.Node;

/**
* Created by clouway on 14-9-15.
*/
public class Tree {

  public void addNode(int key1) {
    Node newNode = new Node(key1);

    //check if this is the root of the tree
    if (root == null) {

      root = newNode;

    } else {
      //the node that we are focusing on it.Root has this node
      Node focusNode = root;
      //future parent for our node
      Node parent;

      //add nodes to the tree
      while (true) {

        //the root
        parent = focusNode;
        if (focusNode.key == key1) {

          return;
        }
        //check if the root go on the right or left side of the parent
        if (key1 < focusNode.key) {

          //change the leftChild to focus and has a key1 value than his parent has
          focusNode = focusNode.leftChild;

          // if left child has no children
          if (focusNode == null) {
            //place the new node of the left of his parent
            parent.leftChild = newNode;
            return;
          }
        } else {
          //put the node to the right
          focusNode = focusNode.rightChild;

          //if the rightChild has no children
          if (focusNode == null) {
            parent.rightChild = newNode;
            return;
          }
        }
      }
    }
  }

  public void print() {
    inOrderTraverseTree(root);
  }

  public void print1() {
    preOrderTraverseTree(root);
  }

  public void search(int key) {
    if (root == null) {
      return;
    }
    searchNode(root, key);
  }

  private Node root;

  private void inOrderTraverseTree(Node focusNode) {

    //check if there is a value
    if (focusNode != null) {
      //traverse the left node
      inOrderTraverseTree(focusNode.leftChild);
      //visit the current focusNode.Next value of the lowest value
      System.out.println(focusNode);
      //travers the right child
      inOrderTraverseTree(focusNode.rightChild);
    }
  }

  private void preOrderTraverseTree(Node focusNode) {

    //check if there is a value
    if (focusNode != null) {
      //visit the current focusNode.Next value of the lowest value
      System.out.println(focusNode);
      //traverse the left node
      preOrderTraverseTree(focusNode.leftChild);
      //travers the right child
      preOrderTraverseTree(focusNode.rightChild);
    }
  }


  private void searchNode(Node focusNode, int key) {
    if (focusNode != null) {
      //traverse the left node
      searchNode(focusNode.leftChild, key);
      if (key == focusNode.key) {

      }
      searchNode(focusNode.rightChild, key);
    }
  }



}
