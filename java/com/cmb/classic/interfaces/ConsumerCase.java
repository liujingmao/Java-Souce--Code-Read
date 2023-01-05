package com.cmb.classic.interfaces;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 */

public class ConsumerCase {

    /**
     *  First Method
     */

    public void testC(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Stream<String> s = Stream.of("333","444","555","666","777");
        s.forEach(con);

        System.out.println("---------Parting Line-----------");

    }

    public void testD(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

      Stream<String>  s = Stream.of("333","444","555","666","777");
      Consumer<String> c = (I)-> System.out.println(I);
      s.forEach(con);

        System.out.println("----parting line----");

        s = Stream.of("333","444","555","666","777");
        Consumer c3 =  System.out::println;
        s.forEach(con);
    }

    public void testE(){
        Consumer<String> c = (x)-> System.out.println(x);
        c.accept("abc_lambda expression");

        Consumer<String> c1 = System.out::println;
        c1.accept("test_method_reference");
    }

    public void getsubString(){
        Consumer<String> str=(s)-> System.out.println(s.substring(2,5));
        str.accept("0123456");
    }

    public void convertToUpperStr(){
        Consumer<String> stringConsumer =(s)-> System.out.println(s.toUpperCase());
        stringConsumer.accept("acb");
    }

    public void testF(){
        Comparator<Integer> comp = (n, m)->Integer.compare(n,m);
        int cop = comp.compare(3,4);
        System.out.println(cop);

        Comparator<Integer> comp1 = Integer::compare;
        int com1 = comp1.compare(6,4);
        System.out.println(com1);

    }

    public void testH(){
        BiPredicate<String,String> b = (x,y)->x.equals(y);
        System.out.println(b.test("bn","bn")); //true

        BiPredicate<String,String> b1 = (a,c)->a.equals(c);
        System.out.println(b1.test("test","test"));//true

        BiPredicate<String,String> c1 = String::equals;
        System.out.println(c1.test("c2","c3"));//false

        BiPredicate<Integer,Integer> biPredicate = Integer::equals;
        System.out.println(biPredicate.test(1,2));
    }



    public static void main(String[] args) {

        ConsumerCase consumerCase = new ConsumerCase();
        //consumerCase.testC();

        //consumerCase.testD();

        System.out.println("Parting Line");
        //consumerCase.testE();

       // consumerCase.testF();

       // consumerCase.testH();
       // consumerCase.getsubString();
        consumerCase.convertToUpperStr();






    }
}
