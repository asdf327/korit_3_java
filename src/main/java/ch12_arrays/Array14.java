package ch12_arrays;

import java.util.Arrays;

public class Array14 {

    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int number = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = ++number; //대입 전애 +1 시키고 대입
                System.out.print(nums[i][j] + "/");
            }
        }

        System.out.println();

        //2차 배열의 출력 : Arrays.deepToString(배열명)
        System.out.println(Arrays.deepToString(nums));
    }
}
