package ch05_converion;

public class Main {
    public static void main(String[] args) {
        /*
            Conversion > 용량 상의 문제로 일어나는 이슈를 해결하기 위해 사용

            upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환
         */

        char ca1 = 'A';
        System.out.println("원형 : " + ca1); //업캐스팅 방법 1, 형변환을 하기 위해서는 (바뀔 데이터 타입)변수명으로 작성
        System.out.println("원형 : " + (int) ca1); //아스키 코드

        char ca2 = 'a';
        System.out.println("원형 : " + ca2);
        System.out.println("원형 : " + (int) ca2);

        //업캐스팅 방법 2
//        char ca3 = 'b';
        //새로운 변수를 선언!
//        int ca4 = ca3;
        // downcasting 다운 캐스팅 : 더 작은 용량의 자료형으로 변환

        int ca5 = 99;
        int ca6 = 100;

        System.out.println("원형 : " + ca5);
        System.out.println("원형 : " + (char) ca5);
        
        char ca7 = (char) ca6;
        System.out.println("원형 : " + ca6);
        System.out.println("원형 : " + ca7);
        
        /*
            업캐스팅의 경우 메모리 용량이 커지기만 하면 기존 데이터의 변형이 일어나지 않기 때문에 암시적 변형이 가능하지만
            다운캐스팅의 경우 데이터를 축소하는 과정에서 메모리 용량을 벗어나지 않기에 면시적으로만 변형 가능
         */
        
    }
}
