package ch00_matte;

import java.util.Scanner;

public class Math01 {
    public static void main(String[] args) {
        int num = (int) ((Math.random() * 10) + 1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 10 사이의 숫자를 입력하세요: ");
        int sum = scanner.nextInt();

        if (sum < 0 || sum > 10){
            System.out.println("잘못 입력된 수입니다");
        } else {
            if (sum != num) {
                System.out.println("숫자가 다릅니다");
            } else {
                System.out.println("숫자가 같습니다!");
            }
        }
        System.out.println("입력한 숫자: " + sum);

        System.out.println("랜덤 숫자: " +  num);
    }
}
