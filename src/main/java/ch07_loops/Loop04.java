package ch07_loops;
/*
    for 반복문
    : 댜부분의 경우에는 명확한 횟수가 결졍되어 있을 때 사용

    형식 :
    for(시작값; 종료값; 증강값){
        반복실행문
    }
 */

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0; i < 101; i++){
//            sum += i;
//        }
//        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력 >>> ");
        int n = scanner.nextInt();
        int sum2 = 0;

        for (int i = 1; i <= n ; i++ ){
            sum2 += i;
        }

        System.out.println("합은 " + sum2 + "입니다");
    }
}
