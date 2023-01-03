package com.cmb.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 *  supplierTest
 *  用途：产生类型为T的对象 方法是
 *  T get()
 */
public class SupplierTest {

    public void testSupplier(){
        Random r  = new Random();
        List<Integer> list = s(10,()->r.nextInt(30));
        for (Integer n:list){
            System.out.println(n);
        }
    }

    public List<Integer> s(int sm, Supplier<Integer> s1){
        List<Integer> l = new ArrayList<>();
        for (int j=0;j<sm;j++){
            l.add(s1.get());
        }
        return l;
    }

    public static void main(String[] args) {
        SupplierTest supplierTest = new SupplierTest();
        supplierTest.testSupplier();
    }

}
