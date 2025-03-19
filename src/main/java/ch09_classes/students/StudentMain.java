package ch09_classes.students;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        //각 생성자를 이용한 객체 생성
        Student student1 = new Student();
        Student student2 = new Student(2025002);
        Student student3 = new Student("김삼");
        Student student4 = new Student(2025004, "김사");
        Student student5 = new Student(2025005,"김오",80.7);

        System.out.println();

        //비어있는 속성에 속성값 대입하는 코드
        student1.studentCode = 2025001;
        student1.name = "김일";
        student1.score = 4.5;
        student1.StudentMat1();

        student2.name = "김이";
        student2.score = 100;
        student2.StudentMat1();

        student3.studentCode = 2025003;
        student3.score = 95.8;
        student3.StudentMat1();

        student4.score = 4.0;
        student4.StudentMat1();

        student5.StudentMat1();
    }
}
