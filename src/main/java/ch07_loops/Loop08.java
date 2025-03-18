package ch07_loops;

import java.util.Scanner;

public class Loop08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;

        System.out.println("멸 줄의 별을 생성하시겠습니까? >>> ");
        row = scanner.nextInt();

        for (int i = 0; i < row; i++){
            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++){
            for (int j = 0; j < row - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
            기본적으로 개행과 별이 찍히는 부분에 2중 퍼문이 전제되어야 한다,

            추가된 사항이 row 변수와 관련된 부분이 개행의 한계값과 관련이 있다
         */
    }
}
