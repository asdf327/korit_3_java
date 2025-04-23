package ch00_matte;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 >>> ");
        int num = scanner.nextInt();

        if (num <= 0){
            System.out.println("잘못된 입력입니다.");
        } else {
            int count = 0;
            while (count < num) {
                System.out.println("Hello, World!");
                count++;
            }
        }
    }
}
