package ch12_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Array11 {

//    public String toString(){
//
//    }

    public static void main(String[] args) {
        //동일한 메서드명이지만 클래스에 따라 다른 로직
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int num = random.nextInt();
//        System.out.println(num);
//        int num2 = scanner.nextInt();
//        System.out.println(num2);
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++){
            nums[i] = i+1;
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        for (int num : nums){
            System.out.print(num + " ");
        }

        System.out.println();

        //배열 전체 출력
        System.out.println(Arrays.toString(nums)); //보기만 할 때 쓰는 아이

        Integer[] numbers = {4,7,1,9,6,2,5,8,10,3};
        System.out.println("정렬 전 베열 : " + Arrays.toString(numbers));

        for (int i = 0 ; i < numbers.length ; i++ ){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //오름차순 정렬
        Arrays.sort(numbers); //.sort의 순서를 바꿈
        for (int i = 0 ; i < numbers.length ; i++ ){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));

        //내림차순
        Arrays.sort(numbers, Comparator.reverseOrder());
        //Comparator.reverseOrder() 메서드를 사용하기 위해 int[] -> Integer[]

        double a = 1.2;
        Double b = 1.2;
    }
}
