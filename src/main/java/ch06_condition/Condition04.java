package ch06_condition;
/*
    if-else if-else문

    형식 :
    if(조건문){
        실행문1
    } else if {
        실행문2
    } else if {
        실행문3
    } else {
        실헹문4
    }
 */

import java.util.Scanner;

public class Condition04 {
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
