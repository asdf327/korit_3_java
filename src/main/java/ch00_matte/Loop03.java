package ch00_matte;

import java.util.Scanner;

public class Loop03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = " ";

        System.out.print(">>> 1부터 12까지의 정수를 입력하세요");
        int date = scanner.nextInt();

        switch (date){
            case 1:
                month = "January ";
                break;
            case 2:
                month = "February ";
                break;
            case 3:
                month = "March ";
                break;
            case 4:
                month = "April ";
                break;
            case 5:
                month = "April ";
                break;
            case 6:
                month = "June ";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August ";
                break;
            case 9:
                month = "September ";
                break;
            case 10:
                month = "October ";
                break;
            case 11:
                month = "November ";
                break;
            case 12:
                month = "December ";
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }

        System.out.println(date + "은 " + month + "입니다.");
    }
}
