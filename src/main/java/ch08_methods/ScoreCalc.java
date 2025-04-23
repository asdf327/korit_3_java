package ch08_methods;

import java.util.Scanner;

public class ScoreCalc {

//    public static int get(int a, int b, int c){
//        int d = 0;
//
//
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double avg = 0.0;
        int num = 0;

//        System.out.print("과목 점수 입력 >>>> ");
//        num = scanner.nextInt();
//        System.out.print("1과목");
//        sum = scanner.nextDouble();
//        System.out.print("2과목");
//        sum = scanner.nextDouble();
//        System.out.print("3과목");
//        sum = scanner.nextDouble();
//        avg = sum/num;
//        System.out.println(sum+avg);

        System.out.println("과목 수 입력 >>>> ");
        num = scanner.nextInt();
        for (int i =0; i < num; i++){
            System.out.println((i+1) + "과목 점수 입력 >>>> " );
            sum += scanner.nextDouble();
        }
        avg = sum/num;
        System.out.println("총합 : " + sum + " 평균 : " +avg);

        scanner.close();
    }
}
