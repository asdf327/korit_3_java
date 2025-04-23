package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);

//        System.out.print("올해 년도를 입력하세요 >>>>");
//        int yrar = scanner.nextInt();
//        String yrar = scanner.nextLine();
//        System.out.println(yrar);
//        System.out.println("올해는 " + yrar + "년입니다");
//        System.out.println("올해는 " + (yrar + 1) + "년입니다");


//        System.out.println("당신의 이름을 입력하세요 >>>");
//        String name = scanner.nextLine();
//
//        System.out.println("제 이름은 " + name + "입니다");

        /*
            String 자료형으로 변수를 선언고 초기화할 때
            String 변수명 = scanner.nextLine();

            int 자료형으로 변수를 선언하고 초기화할 때
            int 자료형 = scanner.nextInt();

            double 자료형으로 변수를 선언하고 초기화할 때
            double 자료형 = scanner.nextDouble();

            scanner를 사용할 때 콘솔에 입력하는 데이터를 변수에 저장히려면 그 자료형을 고려하며 작성
         */

//        System.out.println("키를 입력하세요 >>>");
//        double height = scanner.nextDouble();
//        System.out.println(height);

        System.out.print("나이를 입력하세요 >>>");
        int age = scanner.nextInt();
        System.out.println("저는 올해 " + age + "살입니다");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다");

    }
}
