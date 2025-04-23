package ch12_arrays;

import java.util.Scanner;

public class Array04 {

    public void write(String[] names) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < names.length; i++){
            System.out.println((i+1) + "번 학생 : ");
            names[i] = scanner.nextLine();
        }
    }

    public void print(String[] names){
        for (int i =0; i < names.length; i++){
            System.out.print(names[i]+" ");
        }
    }


    public static void main(String[] args) {
        //입력값을 받기 위한 Scanner
        Scanner scanner = new Scanner(System.in);
        //매서스 사용을 위한 객체 생성
        Array04 array04 = new Array04();
        //인덱스 넘버를 확정
        System.out.print("학생 수를 입력 >>> ");
        int ificNum = scanner.nextInt();
        scanner.nextLine(); //배리어 역할

        //비어있는 배열 선언
        String[] names = new String[ificNum];
        array04.write(names);
        array04.print(names);

    }
}
