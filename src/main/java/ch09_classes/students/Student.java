package ch09_classes.students;

public class Student {
    int studentCode;
    String name;
    double score;

    Student() {
        System.out.println("기본 생성자로 객체가 생성되었습니다");
    }

    Student(int studentCode){
        System.out.println("int 매개변수 생성자 객체가 생성되었습니다");
        this.studentCode = studentCode;
    }

    Student(String name){
        System.out.println("String 매개변수 생성자 객체가 생성되었습니다");
        this.name = name;
    }

    Student(int studentCode, String name){
        System.out.println("int, String 매개변수 생성자 객체가 생성되었습니다");
        this.studentCode = studentCode;
        this.name = name;
    }

    Student(int studentCode, String name, double score){
        System.out.println("int, String double 매개변수 생성자 객체가 생성되었습니다");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    void StudentMat1() {
//        System.out.println("1) student1 " + studentCode + " / " + name + " / " + score + " -> 기본 생성자");
        System.out.println(name + " 학생의 정보입니다 \n학번 : " + studentCode + "\n이름 : " + name + "\n점수 : " + score + "\n");
    }

//    void StudentMat2() {
//        System.out.println("2) student1 " + studentCode + " / " + name + " / " + score + " -> int 매개변수  생성자");
//    }
//
//    void StudentMat3() {
//        System.out.println("3) student1 " + studentCode + " / " + name + " / " + score + " -> String 매개변수  생성자");
//    }
//
//    void StudentMat4() {
//        System.out.println("4) student1 " + studentCode + " / " + name + " / " + score + " -> int, String 매개변수  생성자");
//    }
//
//    void StudentMat5() {
//        System.out.println("5) student1 " + studentCode + " / " + name + " / " + score + " -> int, String, double 매개변수  생성자");
//    }
}
