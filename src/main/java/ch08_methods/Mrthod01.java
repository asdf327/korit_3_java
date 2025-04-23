package ch08_methods;

import java.util.Scanner;

public class Mrthod01 {

    //1. [x|x] [입력값 x |출력값 x]
    public static void call(){
        System.out.println("[ x | x ]");
        System.out.println("오늘은 자바!");
    }

    // 2. [o|x] [입력값 o |출력값 x ]
    public static void call2(String strExample){ //정의 단계()
        System.out.println("[ o | x ]");
        System.out.println("오늘은 자바!" + strExample);
    }

    //3. [x|o] [입력값 x |출력값 o ]
    public static String call3() { // 자료형이 String 명시
        System.out.println("[ x | o ]");

        String r = "";

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < i+1; j++){
                r += "*";
            }
        }
        return r;
    }

    public static String call4(int a, int b, int c, String d){
        String r = "";
        r = a + "년 " + b + "월 " + c + "일 " + d + "요일입니다";

        return r;
    }

    public static  int call5(int age){
        int num = age;
        return  num;
    }

    public static void call6(int age){
        System.out.println(age);
    }

    /*
        함수형 프로그래밍 :
        메서드1의 return 겉이 메서드2의 argument가 되고, 메서드2의 return 값이 메서드3의 argument가 됨

        첫번째 메서드로 부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어짐
     */
    //간단예시
    public static String in(String name, int age){
        return  "이름은 "+name + " 나이는 " + age + " 내년에는 " + (age+1);
    }

    public static void main(String[] args) {
        call();
        call2(" 3월 17일!"); // 호출 단계()
        System.out.println(call3());
        System.out.println(call4(2025, 3, 17, "월"));
        System.out.println();

//        call5(15);
        call6(15);
        //15 한 번만 나옴
//        System.out.println(call6(15));

        int nex = call5(15);
        System.out.println(nex);

//        int nex2 = call6(15);
//        System.out.println(nex2());

        Scanner scanner = new Scanner(System.in);
        String my = "";
        int A = 0;

        System.out.print("이름");
        my = scanner.nextLine(); //메서드 호출 결과를 변수에 담음
        System.out.print("나이");
        A = scanner.nextInt();
        System.out.println(in(my, A));
        // 이상의 코드는 argument의 메서드인 .nextLine .nextInt을 사용와여 그 결과값을 각각 my, A 저징

    }
}