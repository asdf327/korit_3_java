package ch12_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        //비어있는 배열 선언 방식
//        int[] arr01 = new int[100];
//
//        for (int i = 0; i < arr01.length; i++){
//            arr01[i] = (i+1); //값 대입
////            System.out.println(arr01[i] + " "); //출력
//            if (arr01[i] % 3 == 0){
//                System.out.print(arr01[i] + " ");
//            }
//        }

        Scanner scanner = new Scanner(System.in);

        int a = 0;

        System.out.print("학생의 수를 입력 >>> ");
        a = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[a];

        for (int i = 0; i < names.length; i++ ){
            System.out.print((i+ 1) +"번째 학생의 이름 입력 : ");
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < names.length; i++ ){
            if((i+1) % 5 == 0){
                System.out.println(names[i] + " ");
            }
        }

    }
}
