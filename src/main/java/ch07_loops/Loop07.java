package ch07_loops;
/*
    2중 for문
    for(int i; i < 10; i++) {
        반복실행문1-a
        for(int j; j < 10; j++) {
        반복실행문2
     }
     반복실행문1-b
     for(int k; k < 10; k++){
        반복실행문3
     }
     반복실행문1-c
    }
 */

public class Loop07 {
    public static void main(String[] args) {
//        int n = 6;

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*"); //2중 포문 내의
            }
            System.out.println();
        }

/*
        별 찍기를 통한 퍼문 구조 학습
        i = 0, j =0이면 개행이 일어나야 함(실행문2 x)
        i = 1일 때, j = 0일 때 *, j = 1일 때 개행
        i = 2일 때, j = 0, 1이면 *, j = 2일 때 개행
         *
         **
         ***
         ****
         *****

 */

        System.out.println();

//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < i; j++){
//                System.out.print(" ");
//            }
//            for (int k =0; k < n - i; k ++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //
        //개행을 위한 1차 for
        for (int i = 0; i < 6; i++){
            //별찍기를 위한 2차 for
            for (int j = 0; j < 5 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2
        for (int i = 0; i < 5; i++){
            for (int j = 5; j-i > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        /*

         *****
         ****
         ***
         **
         *

         */
    }
}


