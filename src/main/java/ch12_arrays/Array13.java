package ch12_arrays;

import java.util.Arrays;

/*
    다차원 배열 중 2차원 배열

    : 다차원 배열은 2차원 이상의 배열을 의미, 개발 환경상 2차원 배열을 쓰는 경우는 드뭄

    혈식 :

    int[][] arr1 = new int[크기(세로)][크기(가로)] - 선언 방식1
    int[][] arr1 = new int[크기][] - 선언 방식2
    int[][] arr1 = {{1,2}, {3,4},{5,5}} - 선언 방식3 및 초기화

    2차원 배열 선언시, 열의 크기는 지정하지 않아도 되지만 행의 크기는 항상 지정해야 한다 -> 2번 해당

                1열 2열
               0 {1, 2},      -> 가로줄 : 행 -1행(row)
               1 {3, 4},                    -2행
               2 {5, 5}                     -3행

 */
public class Array13 {
    public static void main(String[] args) {
        int[][] arr01 = {
                {1,2},
                {3,4},
                {5,5}
        };
        //arr01 배열에서 5를 뽑기
        System.out.println(arr01[2][0]); //5
        System.out.println(arr01); //[[I@36baf30c
        System.out.println(arr01[1]); //[I@7a81197d
        System.out.println(Arrays.toString(arr01)); //[[I@5ca881b5, [I@7a81197d, [I@24d46ca6]

        System.out.println(arr01[0][0]);
        System.out.println(arr01[0][1]);
        System.out.println(arr01[1][0]);
        System.out.println(arr01[1][1]);
        System.out.println(arr01[2][0]);
        System.out.println(arr01[2][1]);

        //2중 for을 통한 2차 배열의 추출
        for (int i = 0; i < arr01.length; i++){
            for (int j =0; j < arr01[i].length; j++){
                System.out.print(arr01[i][j] + " ");
            }
        }

        //향상된 for문을 통해서 2차 배열의 element 추출
        //2차 배열은 첫 번째 배열의 element의 자료향이 1차 베열이라는 점 주의

        for (int[] element : arr01){
            for (int num : element){
                System.out.print(num + "/");
            }
        }
    }
}
