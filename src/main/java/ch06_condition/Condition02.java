package ch06_condition;
/*
    if - else문 : if 다음에 있는 조건식이 참일 때 이프 문 내의 {} 살행문이 실행
    거짓일 때 다음 {} 실행문 실행

    형식 :
    if(조건문){
        실행문1
    } else {
        실행문2
    }
 */

public class Condition02 {
    public static void main(String[] args) {
        int num = 0;
        if (num < 0 ){
            System.out.println("음수입니다");
        } else {
            System.out.println("양수입니다");
        }
    }
}
