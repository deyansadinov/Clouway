package com.clouway.hettree;


public class HeterogeneousTree {

  public class Node1 {
    Comparable<Object> value;
    Node1 lefChild;
    Node1 rightChild;

    public Node1(Comparable<Object> value) {
      this.value = value;
    }

    public String toString() {
      return this.value.toString();
    }


    public void addNode(Comparable<Object> value) {
      Node1 newNode = new Node1(value);

      //check if this is the root of the tree
      if (root == null) {

        root = newNode;

      } else {
        //the node that we are focusing on it.Root has this node
        Node1 focusNode = root;
        //future parent for our node
        Node1 parent;

        //add nodes to the tree
        while (true) {

          //the root
          parent = focusNode;
          if (focusNode.value.compareTo(value) == 0) {

            return;
          }
          //check if the root go on the right or left side of the parent
          if (focusNode.value.compareTo(value) > 0) {

            //change the leftChild to focus and has a key value than his parent has
            focusNode = focusNode.lefChild;

            // if left child has no children
            if (focusNode == null) {
              //place the new node of the left of his parent
              parent.lefChild = newNode;
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
  }

  private Node1 root;


  public void inOrderTraverseTree() {
    inOrderTraverseTree(root);
  }

  public void addObject(Comparable<Object> o) {
    Comparable<Object> newVal = o;
    //check if the tree is empty
    if (root == null) {
      root = new Node1(o);
      return;
    }
    root.addNode(o);
  }

  public Object search(Comparable searchO) {
    Node1 focusNode = root;
    while (focusNode != null) {
      if (focusNode.value.compareTo(searchO) == 0) {
        return focusNode;
      }
      if (focusNode.value.compareTo(searchO) > 0) {
        focusNode = focusNode.lefChild;
      }
      if (focusNode.value.compareTo(searchO) < 0) {
        focusNode = focusNode.rightChild;
      }
    }
    return null;
  }

  private void inOrderTraverseTree(Node1 focusNode) {

    //check if there is a value
    if (focusNode != null) {
      System.out.println(focusNode);
      //traverse the left node
      inOrderTraverseTree(focusNode.lefChild);
      //visit the current focusNode.Next value of the lowest value

      //travers the right child
      inOrderTraverseTree(focusNode.rightChild);
    }
  }
}
