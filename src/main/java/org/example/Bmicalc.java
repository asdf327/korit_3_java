package org.example;

import java.util.Scanner;

public class Bmicalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height  = 0;
        double weight = 0;
        double bmi = 0;
        String status = "";

        System.out.print("키를 입력하새요 >>>> ");
        height = scanner.nextDouble();
        System.out.print("몸무게를 입력하새요 >>>> ");
        weight = scanner.nextDouble();

        height = height / 100;
        bmi = weight / (height*height);

        if (bmi < 18.5) {
            status = "저체중";
        } else if (bmi < 23){
            status = "정상체중";
        } else if (bmi < 25) {
            status = "과체중";
        } else {
            status = "비만";
        }

        if (bmi < 18.5){
            System.out.println("당신의 BMI 지수는 " + bmi + "이며, " + status + "입니다");
        } else if (bmi < 23){
            System.out.println("당신의 BMI 지수는 " + bmi + "이며, " + status + "입니다");
        } else if (bmi < 25) {
            System.out.println("당신의 BMI 지수는 " + bmi + "이며, " + status + "입니다");
        } else {
            System.out.println("당신의 BMI 지수는 " + bmi + "이며, " + status + "입니다");
        }

    }
}