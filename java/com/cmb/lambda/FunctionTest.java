package com.cmb.lambda;

import java.util.function.Function;

/**
 *  FunctionTest
 *  对类型T的对象进行应用操作，并返回结果
 *  结果是R类型的对象，包含方法
 *  R apply(T t)
 */

public class FunctionTest {

    public void testFunction(){
        String s = st("abc",n->n.substring(0,1));
        System.out.println(s);
        String s1 = st("ab c ", n->n.trim());
        System.out.println(s1);
    }

    public String st(String st, Function<String,String> fun){
        return fun.apply(st);
    }

    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        functionTest.testFunction();
    }
}
