package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        //ClassA를 import
        ClassA classA = new ClassA(); // ClassA와 ClassA()는 다르다
        //클래스명 객체명 = new 클래스명();

        //Scanner import -> Scanner도 class
        // scanner는 객체
        // 정확하게 말하면 scanner 클래스의 인스턴스
        Scanner scanner = new Scanner(System.in);

        //객체 속석을 참고하는 법 : 객체명, 속성명
//        System.out.print("이름 >>> ");
//        classA.name = scanner.nextLine();
//        System.out.println(classA.name + "입니다");
//
//        System.out.print("점수 >>> ");
//        classA.score = scanner.nextDouble();
//        System.out.print("번호 >>>> ");
//        classA.number = scanner.nextInt();
//        System.out.println("실행결과 : " + classA.number + " - 이름 : " + classA.name + " 점수 : " + (int) classA.score);
//        scanner.close();

        //이상까지의 코드는 객체의 속성에 값을 대입하여 이를 출력하는 방식

        //method를 호출
        ClassA classA2 = new ClassA();
        classA2.name = "김미진";
        classA2.call1();
        ClassA classA3 = new ClassA();
        classA3.name = "이상";
        classA3.call1();
    }
}
