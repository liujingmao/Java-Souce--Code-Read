package com.cmb.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {

    public static void main(String[] args) {
      Stream.of("abc", "abc.com", "abc.com.cn", "abc.cn")
                .mapToInt(String::length)
                .filter(l -> l > 4)
                .peek(System.out::println);
                //.limit(1);

        //System.out.println(abc);
    }
}
