package ch03_operator;
/*
    패키지 -> 소문자 작성
    class -> 대문자로 시작, 복수 단어의 경우 다음과 같이 작성
    ex ) MyEne
    이상에서 확인할 수 있는 것은 클래스 작성법이 변수 작성법과 유사
    첫 시작이 대문자냐 아니냐의 차이
    첫 문자 대문자, 두 번째 단어 대문자 = > 파스칼 케이스
    첫 문자 소문자, 두 번째 대문자 - > 카벨 케이스
 */

public class Operator01 {
    public static void main(String[] args) {
        //변수 선언 및 초기화
//        int i = 10;
//        System.out.println(i);

        //대입 연산자 '=' : = 오른쪽 데이터를 왼쪽 변수 대입
        // 동일하다는 의미가 아님

        //a와 b가 같은 의미를 가지고 있다는 의미는 'a == b'
//
//        i = i + 10;
//        System.out.println(i);

        /*
            복합대입연산자
            1. +=
            2. -=
            3. *=
            4. /=

         */

//        int num = 1;
//        System.out.println(num);
//        num += 2;
//        System.out.println(num); // num = num + 2
//        num -= 1;
//        System.out.println(num); // num = num - 1
//        num *= 10;
//        System.out.println(num); // num = num * 10
//        num /= 5;
//        System.out.println(num); // num = num / 5

//        int j = 10;
//        System.out.println(j);
//        System.out.println(j++); //변수명++ : 코드 실행시킨 후에 j에 +1을 더함
//        System.out.println(j); //11
//        System.out.println(++j); //++변수명 : 코드 실행하기 전에 j에 +1을 더함
//        System.out.println(j--);//변수명++ : 코드 실행시킨 후에 j에 -1을 더함
//        System.out.println(j);//11
//        System.out.println(--j); //10

        /*
        일방 수석 연산자
        + : 더하기
        - : 빼기
        * : 곱하기
        / : 나누기
        % : 나머지 연산자
         */

        System.out.println("10/2의 나머지 : " + (10%2));
        System.out.println("10/3의 나머지 : " + (10%3));
        System.out.println("10/4의 나머지 : " + (10%4));

        int age = 10;

        System.out.println("제 나이는" + age + "살입니다. 내년에는 " + (age + 1) + "살 입니다");

    }
}
