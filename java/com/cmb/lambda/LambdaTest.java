package com.cmb.lambda;

/**
 * 经典使用，匿名内部类的使用，初次使用lambda表达式
 */

public class LambdaTest {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("这是匿名内部类输出");
            }
        };

        Runnable runnable1 = ()-> System.out.println("这是lambda表达式");

        runnable1.run();

        System.out.println("****** Parting Line *******");

        runnable.run();

    }
}
