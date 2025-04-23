package ch00_review;
/*
    메서드 - 순차적으로 실행되는 여러 코드를 하나의 이름으로 묶은 것
            유형을 call1() ~ call4() 매개변수 유무 / 리턴 유무

    형식 :
        (접근 지정자) (static) 리턴 타입 메서명(매개변수1, 매개변수2 ...){
            메소드에 순서대로 들어갈 코드
        }
    정의 예시 :
        public String wrtse(String date, String content){
            System.out.println(date + "스케쥴");
            System.out.println(content);
        }
     호출 예시 :
        같은 클래스 내에 정의된 메서드라면(즉, 지금 상황이라면)
        wrtse( date... "12345", content... "메서드 오버로딩 클래스 복습");
 */


import java.util.Scanner;

public class Review05 {
    // 메서드 정의

    //call2() 유형으로 정의
    public void wrtse(String date1, String content){
        System.out.println(date1 + "스케쥴");
        System.out.println(content);
    }

    public void wrtse(int date2, String content){
        System.out.println(date2 + "스케쥴");
        System.out.println(content);
    } //오버로딩의 예시

    //call2() 유형 응용
    public void Sever(int rand){
//        if (rand % 7 == 0){
//            System.out.println(rand + " 7의 약수입니다");
//        } else {
//            System.out.println(rand + " 7의 약수가 아닙니다");
//        }

        String as = "";
        if (rand % 7 == 0){
            as = rand + " 7의 약수입니다";
        } else {
            as = rand + " 7의 약수가 아닙니다";
        }
        System.out.println(rand + as);
    }

    void print(int limit){
        for (int i = 0; i < limit; i++){
            System.out.print((i+1) + " ");
        }
    }

    void eveo(int limit){
        for (int i = 0; i < limit; i++){
            int a = i+1;
            if (a % 2 ==0) {
                System.out.print(a + " ");
            }
        }
    }

    void nums(int limit, int diving){
        for (int i = 0; i < limit; i++){
            int a = i+1;
            if (a % diving == 0) {
                System.out.print(a + " ");
            }
        }
    }

    public static void main(String[] args) {
        Review05 review05 = new Review05();
        Scanner scanner = new Scanner(System.in);

        //메서드 호출 영역
//        review05.wrtse( "12345",  "메서드 오버로딩 클래스 복습");//call2() 유형
//        review05.wrtse( 12345,  "메서드 오버로딩 클래스 복습");//오버로딩
//        System.out.println();

        //call2() 유형 응용1
//        review05.Sever(7);

        //call2() 유형 응용2
//        System.out.print("숫자를 입력하세요 >>> ");
//        int a = scanner.nextInt();
//        review05.Sever(a);

        //반복몬 응용1
//        System.out.print("숫자를 입력하세요 >>> ");
//        int a = scanner.nextInt();
//        review05.print(100);
//        review05.print(a);

        //반복문 응용2
//        review05.eveo(10);

        //반목문 응용3
        System.out.print("한계값을 입력하세요 >>> ");
        int limitValue = scanner.nextInt();
        System.out.print("나누는 값을 입력하세요 >>> ");
        int division = scanner.nextInt();
//        review05.nums(50,4);
        review05.nums(limitValue,division);
    }
}
