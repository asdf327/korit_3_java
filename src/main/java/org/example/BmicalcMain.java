package org.example;

import java.util.Scanner;

public class BmicalcMain {
    public static void main(String[] args) {
        //사용할 클래스를 인포트
//        Scanner scanner =new Scanner(System.in);
//        BmicalcM bmicalcM = new BmicalcM();
//
//        //사용할 변수 목록 초기화
//        double height  = 0;
//        double weight = 0;
//        double bmi = 0;
//        String result = "";
//
//        System.out.print("키를 입력하새요 >>>> ");
//        height = scanner.nextDouble();
//        System.out.print("몸무게를 입력하새요 >>>> ");
//        weight = scanner.nextDouble();
//
////        bmicalcM.grtBmi(170,70);
//        bmi = bmicalcM.grtBmi(height,weight);
//        result = bmicalcM.getBmiResult(bmi);
////        String re2 = bmicalcM.getBmiResult(bmicalcM.grtBmi(height,weight));
//        System.out.println("당신의 BMI 지수는 " + bmi + "이며, " + result + "입니다");

        BmicalcM bmicalcM = new BmicalcM();
        bmicalcM.getBmiResult();
    }
}
