package ch06_condition;
/*

 */

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년을 입력하세요 >>>> ");
        int leap = scanner.nextInt();
        String x = "윤년이 아닙니다";
        String y = "윤년입니다";

        if (leap % 400 == 0) {
            System.out.println(y);
        } else if (leap % 100 == 0) {
            System.out.println(x);
        } else  if (leap % 4 == 0) {
            System.out.println(y);
        } else {
            System.out.println(x);
        }

//        if ((leap % 4 == 0 && leap % 100 != 0) || leap % 400 == 0) {
//            System.out.println("윤년입니다");
//        } else {
//            System.out.println("윤년이 아닙니다");
//        }
    }
}
