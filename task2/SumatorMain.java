package com.clouway.task2;

import java.math.BigDecimal;
import java.math.BigInteger;


        import java.math.BigInteger;
/**
 * Created by clouway on 14-9-9.
 */
public class SumatorMain {
    public static void main(String [] args){

        Sumator x = new Sumator();

        System.out.println(x.sum(3,5));
        System.out.println(x.sum(3.2,5.3));
        System.out.println(x.sum("54" , "56"));
        System.out.println(x.sum(new BigDecimal("4.456456"),new BigDecimal("3.45646456")));
        System.out.println(x.sum(new BigInteger("56745647658678678644"),new BigInteger("45645756786788967")));

    }

}