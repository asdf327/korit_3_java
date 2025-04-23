package ch06_condition;

import java.util.Scanner;

public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int cj = 0;
        String grade = "";

        System.out.print("성적을 입력하세요 >>> ");
        score = scanner.nextInt();

        if (score >= 0 && score <= 100) {
            cj = score / 10;
            switch (cj) {
                case 10, 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                    grade  = "F";
                    break;
                default:
                    System.out.println("x");
                    return;
            }
            System.out.println("점수 : " + score + ", 학점은 " + grade);
        } else {
            System.out.println("1~100 사이를 입력하시오");
        }
        scanner.close();
    }
}
