package com.cmb.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();
        for (int j=0;j<=10;j++
             ) {
            l.add("abc"+j);
        }

        l.stream().forEach(System.out::println);

        System.out.println("*******");

        l.parallelStream().forEach(System.out::println);

        System.out.println("---------------");

        l.stream().parallel().forEach(System.out::println);

        List<String> li = Arrays.asList("ABCDE1","xxxx","abcde fghl");

        li.stream().mapToInt(e->{
            int lint = e.length();
            System.out.println(e);
            return lint;
        }).filter(lint->lint==4).findFirst().ifPresent(System.out::println);

    }
}
