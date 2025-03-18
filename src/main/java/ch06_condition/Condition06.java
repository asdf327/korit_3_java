package ch06_condition;
/*
    중첩 if문
    이프문 내에 이프문이 연속적으로 작성 가능

    형식 :
    if(조건문1-a){
        실행문1-a
    } else if(조건식1-b) {
        실행문1-b
    } else if(조건식1-c) {
        실행문1-c
    } else {
        실헹문1-c
    } if(조건식2-a) {
        실행문2-a
    } else if(조건식2-b) {
        실행문2-b
    } else {
        실헹문2-c
    } else {
        실행문 d
    }
 */

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String grade = "";

        System.out.print("숫자를 입력하세요 >>>> ");
        int score = scanner.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("점수 : " + score + ", 등급 : " + grade);
        } else {
            System.out.println("1~100 사이를 입력하시오");
        }
        scanner.close();
    }
}
