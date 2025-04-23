package ch00_matte;

import java.util.Scanner;

public class Method01 {
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 *  num2;
    }

    public static void divide(int num1, int num2){
        if (num2 == 0){
            System.out.println("0으로 나눌 수 없습니다.");
        } else {
            System.out.println("나눗셈: " + (num1 / (double) num2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.println(add(num1,num2));
        System.out.println(subtract(num1, num2));
        System.out.println(multiply(num1, num2));
        divide(num1, num2);

        scanner.close();
    }
}

