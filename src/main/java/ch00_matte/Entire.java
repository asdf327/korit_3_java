package ch00_matte;

import java.util.Arrays;
import java.util.Comparator;

public class Entire {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {2,5,6}};
        System.out.println(Arrays.deepToString(arr));

        Integer[] arr2 = {5,8,7,9,1};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr2));
    }
}
