package com.cmb.classic.interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierCase {

    public void supplierTest(){
        Supplier<Integer> su = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt();
            }
        };
        System.out.println(su.get());

        System.out.println("********Parting Line**************");

        su = ()-> new Random().nextInt();
        System.out.println(su.get());

        System.out.println("-------Parting Line--------");

        su = new Random()::nextInt;

        System.out.println(su.get());

        System.out.println("**********Method Referene*********");

        Supplier<Double> su2  = Math::random;
        System.out.println(su2.get());

    }

    public static void main(String[] args) {

        SupplierCase supplierCase = new SupplierCase();
        supplierCase.supplierTest();

    }
}
