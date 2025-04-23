package ch12_arrays;

import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생의 수를 입력 >>> ");
        int indexNum = scanner.nextInt();
        scanner.nextLine();

        String[] students = new String[indexNum];

        for (int i = 0; i < students.length; i++ ){
            //students.length == indexNum;
            System.out.print((i+ 1) +"번째 학생의 이름 입력 : ");
            students[i] = scanner.nextLine();
        }

        for (int i = 0; i < students.length; i++ ){
            System.out.println(students[i]);
        }

        System.out.println();

        for (String student : students){
            //students.length == indexNum;
            System.out.println(student);
        }

    }
}
