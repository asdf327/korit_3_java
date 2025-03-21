package ch00_review;

import java.util.Scanner;

public class Review02 {
//
//    public static double add(double a, double b){
//        return a*b;
//    }

    public static void main(String[] args) {
        double height = 0;
        double width = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("가로");
        height = scanner.nextDouble();
        System.out.println("세로");
        width = scanner.nextDouble();

        double extent1 = 0.5 * height * width;
        double extent2 = height * width;
        System.out.println(extent1);
        System.out.println(extent2);

//        double extent3 = add(3,4);
//        System.out.println(extent3);

    }
}
