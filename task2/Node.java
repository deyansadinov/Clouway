package com.clouway.task2;

/**
* Created by clouway on 14-9-15.
*/
public class Node {

    int key;


    Node leftChild;
    Node rightChild;

    public Node(int key) {
        this.key = key;


    }
    public String toString(){
        return   "has a key " + key;
    }
}
