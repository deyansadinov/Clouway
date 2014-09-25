package com.clouway.task1.com.clouway.task1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/**
 * Created by clouway on 14-9-9.
 */

public class Array {


    private static final String CHARS = "fdgdfgdgsfdsfgthrb";

    private int[] array;


    /**
     * Find the gcd of two numbers
     *
     * @param a
     * @param b
     */

    public int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;

            } else {
                b = b - a;
            }
        }
        return a;
    }

    /**
     * Find lmd of two numbers
     *
     * @param a
     * @param b
     */
    public int lmd(int a, int b) {
        int x = gcd(a, b);
        return a / x * b / x * x;
    }

    /**
     * Print the array
     */
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }


    }

    /**
     * get Minimal Element of the array
     */
    public int getMinElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    /**
     * Get the sum of the array
     */
    public int getSum(int[] array) {
        int sum = 0;
        for (int x : array) {
            sum = sum + x;
        }
        return sum;
    }

    /**
     * QuickSort
     */

    public void quickSort(int[] array, int low, int high) {


        if (array == null || array.length == 0) {
            return;
        }
        if (high <= low) {
                return;
        }

        //pick the pivot

        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;

            }
        }
        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }


    }

    /**
     * To reverse a array
     *
     * @return
     */

    public int[] reverseArray(int[] array) {
        int temp;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            temp = array[i];
            array[i] = array[len - 1];
            array[len - 1] = temp;
            len--;
        }
        return array;
    }

    /**
     * Generet random string
     *
     * @param
     * @return
     */


    public String stringGenerator(int size ) {

        StringBuilder strb = new StringBuilder();

        Random rnd = new Random();

        for (int i = 0; i < size; i++) {

            int code = 65;
            code += rnd.nextInt(57);
            strb.append((char) code);
        }

        String output = strb.toString();


        return output;
    }




}
