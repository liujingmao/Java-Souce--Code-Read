package com.cmb.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamGroupTest {
    public static List<User> us = Arrays.asList(new User("aaaa",18),
            new User("bbbb",21),
            new User("cccc",33),
            new User("bbbb",23),
            new User("ffff",32),
            new User("aaaa",29));
    public void group(){
        Map<String,List<User>> m = us.stream().collect(Collectors.groupingBy(User::getName));
        Set keyset = m.keySet();
        for (Object e:keyset){
            System.out.println(m.get(e));
            System.out.println("*************");
        }
    }
    public static void main(String[] args) {
        StreamGroupTest groupTest = new StreamGroupTest();
        groupTest.group();
    }
}
