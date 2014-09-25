package com.clouway.task1.com.clouway.task1;

import java.util.Arrays;

/**
 * Created by clouway on 14-9-9.
 */
public class IntroductionMain {
    public static void main(String[] args) {

        int[] array = new int[]{1, 7, 3, 5, 2, 6, 5};


        Array intojava = new Array();


        System.out.println("The gcd of two numbers is " + intojava.gcd(14, 6));
        System.out.println("The lmd of two numbers is " + intojava.lmd(84, 56));



          intojava.printArray(array);




        int min1 = intojava.getMinElement(array);
        System.out.println("\nThe min. element in the array is " + min1);


        int suma = intojava.getSum(array);
        System.out.println("The sum of the array is " + suma);

        int low = 0, high = array.length - 1;
        intojava.quickSort(array, low, high);
        System.out.println("The quicksorted Array is : " + Arrays.toString(array));


        int[] rev = intojava.reverseArray(array);
        System.out.println("The reverse array is " + Arrays.toString(rev));



        String output = intojava.stringGenerator(3);
        System.out.println(output);





    }


}
