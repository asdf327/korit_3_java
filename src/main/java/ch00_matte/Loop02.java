package ch00_matte;

import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import java.util.Set;

public class Loop02 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 4, 2, 5};

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : numbers){
            set.add(num);
        }

        System.out.println(set);
    }
}
