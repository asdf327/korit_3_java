package ch08_methods;
/*
    메서드 오버라이딩
        매개변수의 형태가 다르면 동일한 메서드 명을 가지고 정의
        즉, 메서드명은 똑같고 parameter 들어가는 자료형 및 변수명 다음

    오버라이딩 장점
        동일한 기능을 메서드를 정의할 때 메서드명이 필요
        예를 들어 자료형끼리 연결하는 메서드와 int 끼리 연산하는 메서드를 나눌 때
        등의 메서드를 정의했따면
 */

public class Overloading {
    //메서드 정의
    //call() 작성
    public  static void add(){
        System.out.println("add()");
    }
    //call2() 작성
    public static void add(String s){
        System.out.println("add(String s)");
        System.out.println(s);
    }

    //call2() 작성 2
    public static void add(int a, int b){
        System.out.println("add(int a, int b)");
        System.out.println(a+b);
    }

    //call2()유형으로 작성 3
    public static void add(int a, int b, int c){
        System.out.println("add(int a, int b, int c)");
        System.out.println(a+b+c);
    }

    public static void add(String s, int a){
        System.out.println("add(String s, int a)");
        System.out.println(s+a);
    }

    //매개변수 순서가 달라도 오버라이딩 해당
    public static void add(int a, String s){
        System.out.println("add(int a, String s)");
        System.out.println(a+s);
    }

    public static void main(String[] args) {
        add();
        add("안녕");
        add(1,2);
        add(1,2,3);
        add("asdf", 10);
        add(10,"dfas");
    }
}
