package ch00_review;

import java.util.Scanner;

public class Review03 {
    public static void main(String[] args) {

        /*
            조건식 : 참 / 거짓으로 결정나는 식
            조건식이 참이면 {} 내에 실행문이 실행됨

            조건식(실행문 1){
            실행문1
            }if (조건식 1-a){
            조건식 1-a
            } else if(조건식 1-b){
            조건식 1-b
            } else {
            조건식 1-c
            }
         */
        int age = 0;
        int he = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("나이 >>> ");
        age = scanner.nextInt();
        System.out.println("키 >>> ");
        he = scanner.nextInt();

//        if (age >= 7) {
//            System.out.println("규정 나이 7세 이상입니다");
//            if (he >= 110){
//                System.out.println("입장합니다");
//            } else {
//                System.out.println("규정 키 미만입니다");
//            }
//            System.out.println("감사합니다");
//        } else {
//            System.out.println("규정 나이 미만입니다");
//        }

//        if (he >= 110){
//            System.out.println("규정 키 입니다");
//            if (age >= 7) {
//                System.out.println("입장합니다");
//            } else  {
//                System.out.println("규정 나이 미만입니다");
//            }
//            System.out.println("감사합니다");
//        } else {
//            System.out.println("규정 키 미만입니다");
//        }

        if (he >= 110 && age >= 7){
            System.out.println("입장합니다");
        } else {
            if (he <= 110) {
                  System.out.println("규정 키 미만입니다");
            } if (age <= 7){
                System.out.println("규정 나이 미만입니다");
            }
        }

    }
}
