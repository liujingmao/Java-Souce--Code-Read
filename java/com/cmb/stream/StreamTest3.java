package com.cmb.stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

/**
 *
 */

public class StreamTest3 {

    public static List<User> us = Arrays.asList(new User("aaaa",18),
            new User("bbbb",21),
            new User("cccc",33),
            new User("dddd",23),
            new User("ffff",32),
            new User("eeee",29));

    public static User u1 = new User("hhhh",21);
    public static User u2 = new User("jjjj",29);
    public static List<User> us2 = Arrays.asList(u1,u1,u2);

    @Test
    public void testFilter(){

        Stream<User> stream = us.stream()
                .filter((i)->{
                 Boolean f = i.getAge()>23;
                 return f;
        });
        stream.forEach(System.out::println);
    }


    public static void main(String[] args) {

        // Method 1
       /* List<String> l = new ArrayList<>();
        Stream<String> str1 = l.stream();

        Set<String> se = new HashSet<>();
        Stream<String> str2 = se.stream();

        Map<String,String> map = new HashMap<>();
        Stream<String> str3 = map.keySet().stream();
        Stream<String> str4 = map.keySet().stream();

        Stream<Map.Entry<String,String>> str5 = map.entrySet().stream();

        // Method 2
        Stream<String> strb = Stream.of("eee","lll","kkk");
        String [] strss = {"eee","rrr","ttt"};

        Stream<String> str7 = Stream.of(strss);

        int[] arrm = {886,333,999};
        Stream<int[]> str8 = Stream.of(arrm);

         List<User> us = Arrays.asList(new User("aaaa",18),
                new User("bbbb",21),
                new User("cccc",33),
                new User("dddd",23),
                new User("ffff",32),
                new User("eeee",29));

         User u1 = new User("hhhh",21);
         User u2 = new User("jjjj",29);
         List<User> us2 = Arrays.asList(u1,u2);


        */

         StreamTest3 streamTest3 = new StreamTest3();
         streamTest3.testFilter();


    }
}
