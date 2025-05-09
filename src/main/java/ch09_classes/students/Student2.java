package ch09_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    Student2() {
        System.out.println("기본 생성자로 객체가 생성되었습니다");
    }

    Student2(int studentCode) {
        System.out.println("int 매개변수 생성자 객체가 생성되었습니다");
        this.studentCode = studentCode;
    }

    Student2(String name) {
        System.out.println("String 매개변수 생성자 객체가 생성되었습니다");
        this.name = name;
    }

    Student2(String name, int studentCode) {
        System.out.println("int, String 매개변수 생성자 객체가 생성되었습니다");
        this.name = name;
        this.studentCode = studentCode;
    }

    Student2(int studentCode, String name, double score) {
        System.out.println("int, String double 매개변수 생성자 객체가 생성되었습니다");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    void StudentMat1() {
        System.out.println(name + " 학생의 정보입니다 \n학번 : " + studentCode + "\n이름 : " + name + "\n점수 : " + score + "\n");
    }


}
