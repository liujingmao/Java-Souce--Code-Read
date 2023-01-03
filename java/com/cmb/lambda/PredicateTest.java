package com.cmb.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *  确定类型T的对象是否满足某种约束
 *  并返回boolean值，包含方法
 *  boolean test(T t)
 */

public class PredicateTest {

    public void testPredict(){
        List<Integer> ll = new ArrayList<>();
        ll.add(10);
        ll.add(192);
        ll.add(131);
        ll.add(821);
        ll.add(18);
        List<Integer> l = fInte(ll,n->(n>100));
        for (Integer integer:l){
            System.out.println(integer);
        }
    }

    public List<Integer> fInte(List<Integer> li, Predicate<Integer> p){
        List<Integer> l = new ArrayList<>();
        for (Integer integer:li){
            if (p.test(integer)){
                l.add(integer);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        PredicateTest predicateTest = new PredicateTest();
        predicateTest.testPredict();
    }
}
