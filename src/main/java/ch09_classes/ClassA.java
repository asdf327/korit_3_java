package ch09_classes;
/*
    1. 클래스란 ?
    객체를 생성하기 위한 설계도 = 틀 / 청사진
    현실 세계의 개념을 프로그래밍으로 표현할 때
    "특정 사물이나 개념의 특징(속성)과 행동(메서드)으로 정의 함
    자동차를 만든다면 자동차 속성과 행동을 코드로 표현

    2. 객체란?
    클래스를 설계도로 가정할 때, 사용 가능한 자동차(인스턴스)는 객체

    객체와 인스턴스의 관계
    객체는 포괄적인 개념으로 클래스에서 생성된 모든 것을 객체
    인스턴스는 특정 객체가 어떤 클래스의 구현체인지 강조

    비유로 이해하기
    클래스 : 설계도
    객체 : 설계도를 바탕으로 만들어진 실물
    인스턴스 : 특정 설계도로 만들어진 해당 실물

    1. 사람이라는 클래스
    2. 홍길동, 기청수는 이 클래스에서 생성된 객체
    3. 홍길동은 사람 클래스릐 인스턴스

 */

public class ClassA {
    //main x

    //필드(속성) / 인스턴스 변수 / 멤버 변수
    int number;
    String name;
    double score;

    //메서드 정의
    void call1(){  //public class void가 아니라 그냥 void
        System.out.println(name + "을 부릅니다");
//        System.out.println("실행결과 : " + number + " - 이름 : " + name + " 점수 : " + score);

    }
}
