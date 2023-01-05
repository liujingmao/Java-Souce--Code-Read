package com.cmb.stream;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class StreamInterator {
    public static void main(String[] args) {
        final long count = 10_00000;
        List<Long> l = new ArrayList<>();
        for (long i = 0;i<count;i++){
            l.add(i);
        }

        Instant b = Instant.now();
        for (Long i: l){
            System.out.println("");
        }

       Instant e = Instant.now();
        System.out.println("Outside Time(ms):"+Duration.between(b,e).toMillis());

       /* b = Instant.now();
        l.stream().forEach(x-> System.out.println(""));

         e = Instant.now();
        System.out.println("Inner Time(ms):"+Duration.between(b,e).toMillis());
*/

    }

}
