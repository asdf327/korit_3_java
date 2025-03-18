package ch07_loops;
/*
    whils 반복문

    형식:
    whils(조건식){
        반복실행문
    }

    whils 뒤에 나오는 (조건식)울 했을 때 이프(조건문) 형태와 유사
    즉, whils() 내에 있는 조건식이 참일 때, {} 실행을 반족함

    그래서 거짓 조건이 없다면 무한 루프에 빠짐

  */

public class Loop01 {
    public static void main(String[] args) {
//        int i = 1;

//        while (i < 101){
//            System.out.println(i);
//            i++;
//        }

        int sum = 0;
        int i = 0;
        while (i<11){
            sum += i;
            i++;
        }
        System.out.println(sum);

        int sum2 = 0;
        int i2 = 0;
        while (i2 < 100){
            if (i2 % 2 != 0){
                sum2 += i2;
            }
            i2++;
        }
        System.out.println(sum2);

        int sum3 = 0;
        int i3 = 0;
        while (i3 < 100) {
            sum3 += i3;
            i3 += 2;
        }
        System.out.println(sum3);
    }
}
