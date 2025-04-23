package ch00_review;

import java.util.Scanner;

public class Review01 {
    public static void main(String[] args) {
//        System.out.println("Hello, Java!");
        //변수 : 데이터를 담는 바구니인데 이름표를 붙여줘요
        //변수의 선언 방식
        //자료형 변수명 = 데이터;
        //자료형 : int, double, String, boolean
        //변수명 규칙 : 카멜케이스
        // 카멜케이스 예시 : myExamle
//        double he = 170;
//        System.out.println(he);


        int age = 0;
        int birthday = 0;
        String name = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 >>> ");
        name = scanner.nextLine();
        System.out.print("나이 >>> ");
        age = scanner.nextInt();
        System.out.print("생일 >>> ");
        birthday = scanner.nextInt();

        System.out.println("제 이름은" + name + "이고, 나이는 " + age + "입니다");
        System.out.println("생일은 " + birthday);
        System.out.println("10년 후에는 " + (age + 10));
    }
}
