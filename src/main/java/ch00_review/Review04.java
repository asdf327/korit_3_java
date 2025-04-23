package ch00_review;

import java.util.Scanner;

public class Review04 {
    public static void main(String[] args) {
        /*
            for(시작값; 한계값; 증강값;){
                반복실행문
            }
            시작값과 처음 선언하는 변수여야 오류를 막을 수 있다

            for(시작값; 한계값; 증강값;){
                반복실행문1
                while / if / for(){
                    반복실행문2
                }
            }

         */
//        int li = 100;
//
//        for (int i = 0; i < li; i++){
////            System.out.println(i  + " ");
//            int add = i + 1;
//            if (add % 2 == 0){
//                System.out.println(add);
//            }
//        }

//        int n = 1;
//        while (n < li+1) {
//            if (n % 2 == 0){
//                System.out.println(n);
//        }
//        n++;
//        }
        //사용할 클래스 목록(객체 목록)
        Scanner scanner = new Scanner(System.in);

        //사용할 변수 목록
        int num = 0;
        double sum = 0;
        double avg = 0;

        System.out.println("학생 수 >>> ");
        num = scanner.nextInt();

        int n = 1;
        double score = 0;
//        while (n <= num){
//            System.out.println("학생 점수 >>> ");
//            score = scanner.nextDouble();
//            sum += score;
//            n++;
//        }
//        System.out.println("총합 : " + sum);
//        avg = sum / num;
//        System.out.println("평균 : " + avg);
//
        for (int i = 0; i < num; i++){
            System.out.println("학생 점수 >>> ");
            score = scanner.nextDouble();
            if (score < 0 || score > 100){
                System.out.println("불가능한 점수");
                System.out.println("처음부터 다시 하십시오");
                break;
            }
            sum += score;
        }
        System.out.println("총합 : " + sum);
        avg = sum / num;
        System.out.println("평균 : " + avg);


        /*
            이상의 코드에서 sum avg 사용하지 않았는데 미리 선언되어 있습니다
            이는 코드가 많았을 경우 변수 모아둔 곳에 가서 고치기 쉽게 만들려고 하는 겁니다

         */

    }
}
