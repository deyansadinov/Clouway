package com.clouway.hetTree;

/**
 * Created by clouway on 14-9-16.
 */
public class HetTreeMain {
  public static void main(String[] args) {


    HeterogeneousTree tee = new HeterogeneousTree();

    Animal animal1 = new Animal("Sharo", 3);
    Animal animal2 = new Animal("Bobi", 2);
    Animal animal3 = new Animal("Maks", 4);
    Animal animal4 = new Animal("Qnko", 5);
    Animal animal5 = new Animal("Petar", 1);
    Animal animal6 = new Animal("Starshko", 7);

    tee.addObject(animal1);
    tee.addObject(animal2);
    tee.addObject(animal3);
    tee.addObject(animal4);
    tee.addObject(animal5);
    tee.addObject(animal6);


    tee.inOrderTraverseTree();

    if (tee.search(animal2) != null){
      System.out.println("The object " + animal2 + " is found" );
    }else{
      System.out.println("the object is not found");
    }

  }
}
