package ch06_condition;
/*
    조건문
    1. if : if 다음에 있는 () 내에 조건식이 진실일 때 {}내의 실행문 실행 거짓일 때 x

    형식
    if(조건식) {
        조건식 참/거짓일 때 발동여부 확인
    }
 */

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        int num = 10;

        if (num > 0){
            System.out.println("0입니다");
        }

        Scanner scanner = new Scanner(System.in);
        int num2 = scanner.nextInt();

        if (num2 > 0) {
            System.out.println("num2는 양수입니다");
        }
    }
}
