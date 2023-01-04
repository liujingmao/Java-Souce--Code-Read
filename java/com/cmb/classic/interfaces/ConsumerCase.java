package com.cmb.classic.interfaces;

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



    public static void main(String[] args) {

        ConsumerCase consumerCase = new ConsumerCase();
        consumerCase.testC();

        consumerCase.testD();






    }
}
