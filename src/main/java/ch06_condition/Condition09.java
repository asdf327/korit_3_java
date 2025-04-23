package ch06_condition;
/*
상항 연산자 :  조건식을 평가하여 참/거짓에 따라 두가지 표현식 중 선택적으로 실행

조건식 ? 표현식 : 표현식2

형식 :
조건식 참 거짓 평가
표현식 참일 때
표현식2 거짓일때

 */

public class Condition09 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int max = (a > b) ? a : b;

        System.out.println("더 큰 숫자는 " + max);

        int max2 = 0;
        if (a > b){
            max2 = a;
        } else {
            max2 = b;
        }
        System.out.println("더 큰 숫자는 " + max2);
    }
}
