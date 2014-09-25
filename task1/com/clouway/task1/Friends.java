package com.clouway.task1.com.clouway.task1;

import javax.jws.soap.SOAPBinding;

/**
 * Created by clouway on 14-9-10.
 */
public class Friends {
    public static void main(String[] args) {
        User i=new User("DIDO",12);
        System.out.printf(i.getName()+i.getAge());
    }
}




