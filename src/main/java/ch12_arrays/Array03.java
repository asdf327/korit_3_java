package ch12_arrays;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"A", "B", "C", "D", "E", "f", "G", "H", "I", "J"};

        //특정 배수를 추출하기 위한 기준점 변수
        System.out.println("배수할 숫자를 입력하세요 >> ");
        int specificNum = scanner.nextInt();

        for (int i =0; i < names.length; i++){
            if ((i+1) % specificNum  ==0 ){
                System.out.println(names[i]+" ");
            }
        }
    }
}
