package ch02_variable;
/*
    주석 : 자바 프로그램의 경우 폴더 및 파일의 전채 코드를 컴파일링하는데,
    거기서 오류가 발생하면 전체 프로그램이 실행
    하지만 주석 처리를 한 부분에 대해서는 컴푸터 코드로 인지하지 않기 때문에 오류가 발생하지 않음

    즉, 주석이란 컴푸처가 읽어서 처리하는 부분이 아니라 사람이 읽어서 정보를 얻을 수 있도록하는데에 의의가 있다

    한줄주석 : //
    다죽 주석 : / + shift + *
    사후 주석 :  ctrl + /

    변수 : 데이터를 담을 수 있는 바구니
 */

public class Name {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.println("안녕하세요");
//        System.out.println("안녕하세요 김미진입니다"); // ctrl + D = 복사
//        System.out.println("123");
//        System.out.println(123 + 1);
//        System.out.println("123" + 1);

        //변수 선언 방법
        //자료형 변수명 = 데이터
//        int score = 100;
//        System.out.println(100);
//        System.out.println(score);

        // 1. 논리 자료형 변수 : 참 true / 거짓 false
//        boolean check = false;
//        System.out.println(check);
//        check = true;
//        System.out.println(check);
//
//        // 이상에서 볼 수 있듯이 처음 변수를 언급할 때에는 변수명 = 데이터의 형태로 작성하지만
//        // 다시 대입하는 경우 변수명 = (바뀌는)데이터의 형태로 적성
//
//        check2 = true - > 애는 check2가 처음 등장했는데 자료형이 명시되지 않았기에 오류
//
//        boolean check3; //변수 선언하는 부분 : 자료형 변수명
//        check3 = true; // 변수에 처음 값을 대입 이를 '초기화'라고 함
//        check3 = false; // 변수 값을 '재대입;

//        //2. 문자 자료형 변수
//        char nam1 = '안'; //문자를 입력할 때는 작은 따음표(')를 감쌈
//        char nam2 = '안'; // char : 알파벳/한긓/숫자 하나를 의미
//        char nam3 = '안'; // 문자 =/= 문자열
//
//        System.out.println(nam1 + nam2 + nam3); //151512
//
//        System.out.println("" + nam1 + nam2 + nam3); //안안안
//
//        /* 이상의 코드에서 확인할 수 있는 것은 컴푸터는 생각보다 멍청해서 개발자가
//        하나하나 지정을 해줘야 한다 문자외 문자열이 서로 다른 개념인데
//        문자를 세 번 더하면 더이상 문자가 아니라 문자열로 린식되기 때믄에 원하는 방식대로 출력되지 않는다
//        그렇기 때문에 저희는 sout() 안에 ??을 널어줌으로 () 안의 부분이 전체 문자열로 인식되게끔 꼼수를 부림
//         */
//
//        //3. 정수 자료형
//        int wi = 100;
//        int wi2 = 200;
//
//        System.out.println(wi2 + wi); //숫자끼리 연산 가능
//
//        String wd1 = "300";
//        String wd2 = "400";
//
//        System.out.println(wd1 + wd2); //300400
//
//        System.out.println(wd1 + wi2); //문자열 + 정수 300200
//
//        System.out.println(wi + wd2); //정수 + 문자열 100400
//
//        // 4. 실수 자료형
//
//        double p1 = 3.123456;
//
//        System.out.println(19 + p1);
//
//        // 지름이 42인 원의 넓이를 구하시오
//
//        //반지름의 제곱 * p1
//        System.out.println(21 * 21 * p1);
//
//        //반지름이 17안 원의 둘레를 구하시오
//
//        System.out.println(17*2*p1);

        /*
        자바에서의 변수 표기 방식 :
            1. 카멜 표기법 : 첫문자는 소문자로 시작, 복수 단어로 이루어짐
            두 번째 단어의 첫 문자만 대문자
            2. 특수문자 지양
         */

        //5. 문자열 자료형
        // 대문자로 시작한다
//        String nane = "김미진";
//        String ma  = "영여";
//        String jop  = "코리아";
//
//        System.out.println("안녕하세요 " + nane + ma + "를 합니디");
//        System.out.println(jop);

        String name1 = "김미진";
        int age1 = 27;
        String name2 = "IT 종합학과";
        String name3 = "코리아 IT 아카데미";

        System.out.println("저는 " + name3 + " 3월 국비 과정을 수강하고 있는 " + name1 + "입니다\n");
        System.out.println("제\t 전공은 " + name2 + "이고, " + "나이는 " + age1 + "세 입니다" );






    }
}
