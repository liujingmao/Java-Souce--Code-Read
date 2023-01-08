package com.cmb.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitionTest {



    public static List<User> us = Arrays.asList(new User("aaaa",18),
            new User("bbbb",21),
            new User("cccc",33),
            new User("bbbb",23),
            new User("ffff",32),
            new User("aaaa",29));

    public void partition(){
        Map<String,Map<Boolean,Long>> m = us.stream().collect(Collectors.groupingBy(User::getName,
                Collectors.partitioningBy(u->{
                    if (u.getAge()>=25){
                        return true;
                    } else {
                        return false;
                    }
                },Collectors.counting())));
        System.out.println(m);
    }


    public static void main(String[] args) {

       StreamPartitionTest streamPartitionTest = new StreamPartitionTest();
       streamPartitionTest.partition();

    }
}
