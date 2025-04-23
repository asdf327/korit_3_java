package ch12_arrays;
/*
    향상된 for문

    일반 퍼문과 차이점 :
        일반 for문의 경우 인덱스 넘버(주소지)를 명확확하게 알고 있어야 하지만
        for(int i = 0;..)의 i는 for문 내부의 선언이므로 넘버(주소지) 없이 for문을 사용할 수 있다.

        제약 :
        추출은 되고, 입력은 안 된다

        형식 :
        for(자료형 변수명 : 반복가능객체(배열){
        }
 */

import java.util.Scanner;

public class Array08 {
    public static void main(String[] args) {
        int[] numbers = new int[200];

        //일반 for문
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (i+1);
            System.out.print(numbers[i] + " ");
        }

        //향상된 fot문
        System.out.println();

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        String[] names = {"A", "B", "C", "D", "E", "f", "G", "H", "I", "J"};
        for (String num1 : names){
            System.out.print(num1 + " ");
        }
    }
}
