package ch06_condition;
/*
    switch(변수명)
        cass 조건1
            실행1
            break;
         cass 조건2
            실행2
            break;
         default;
            실행문3
 */

import java.util.Scanner;

public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String se = null;

        System.out.println("선택 프로그램");
//        System.out.println("a. 메뉴1");
//        System.out.println("b. 메뉴2");
//        System.out.println("c. 메뉴3");
//        System.out.println("d. 메뉴4");
//        System.out.println("e. 메뉴5");
        System.out.println("1. 메뉴1");
        System.out.println("2. 메뉴2");
        System.out.println("3. 메뉴3");
        System.out.println("4. 메뉴4");
        System.out.println("5. 메뉴5");

        System.out.print("메뉴를 선택하시오 >>> ");
//        se = scanner.nextLine();
        int se = scanner.nextInt();

        switch (se){
            case 1:
                System.out.println("메뉴1");
                break;
            case 2:
                System.out.println("메뉴2");
                break;
            case 3:
                System.out.println("메뉴3");
                break;
            case 4:
                System.out.println("메뉴4");
                break;
            case 5:
                System.out.println("메뉴5");
                break;
            default:
                System.out.println("잘못 선택");
        }

//        switch (se) {
//            case "a":
//                System.out.println("메뉴1");
//                break;
//            case "b":
//                System.out.println("메뉴2");
//                break;
//            case "c":
//                System.out.println("메뉴3");
//                break;
//            case "d":
//                System.out.println("메뉴4");
//                break;
//            case "e":
//                System.out.println("메뉴5");
//                break;
//            default:
//                System.out.println("잘못 선택");
//        }
    }
}
