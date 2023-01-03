package com.cmb.lambda;

import java.util.function.Consumer;

/**
 *  1. Comsumer 接口类型的使用
 */

public class ComsumerInterface {

    public void testConsumer(){
        co(200,(x)-> System.out.println(x));
    }

    public void co(double m, Consumer<Double> c){
        c.accept(m);
    }

    public static void main(String[] args) {

        ComsumerInterface comsumerInterface = new ComsumerInterface();
        comsumerInterface.testConsumer();
    }



}
