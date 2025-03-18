package ch06_condition;
/*
    if-else if문 : if-else문과 달리 여러 조건문을 실행할 수 있음

     형식 :
    if(조건문){
        실행문1
    } else if {
        실행문2
    } else if {
        실행문3
    }
 */

import java.util.Scanner;

public class Condition03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        final  int VIP1 = 80;
        final  int VIP2 = 60;
        final  int VIP3 = 40;
        final  int VIP4 = 20;

        String rating = "";

        System.out.print("회원 포인트 입력 >>>>");
        num = scanner.nextInt();

//        if (num > 80){
//            System.out.println("VIP");
//        } else if (num > 60) {
//            System.out.println("gold");
//        } else if (num > 40) {
//            System.out.println("실버");
//        } else if (num > 20) {
//            System.out.println("동테");
//        } else {
//            System.out.println("일반 회원");
//        }

//        if (num > VIP1){
//            System.out.println("VIP");
//        } else if (num > VIP2) {
//            System.out.println("gold");
//        } else if (num > VIP3) {
//            System.out.println("실버");
//        } else if (num > VIP4) {
//            System.out.println("동테");
//        } else {
//            System.out.println("일반 회원");
//        }
        //개발 환경에서 2번 효율적

        if (num > VIP1){
            rating = "VIP";
        } else if (num > VIP2) {
           rating = "gold";
        } else if (num > VIP3) {
            rating = "실버";
        } else if (num > VIP4) {
            rating = "동테";
        } else {
            rating = "일반";
        }

        System.out.println("당신의 등급은 : " + rating);
    }
}
