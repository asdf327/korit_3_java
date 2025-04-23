package ch17_static.singleton;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장");

        SamsungPhone samsungPhone1 = factory1.prod();
        //prod()의 리턴 타입은 SamsungPhone의 객체
        System.out.println(samsungPhone1);
        SamsungPhone samsungPhone2 =factory2.prod();
        System.out.println(samsungPhone2);
        SamsungPhone samsungPhone3 =factory3.prod();
        System.out.println(samsungPhone3);
        SamsungPhone samsungPhone4 =factory4.prod();
        System.out.println(samsungPhone4);

        /*
            이상의 코드들을 실행시켰을 때 알 수 있는 점으로는
            어느 공장 객체에서 메서드를 실행시켰든지 간에
            createSerialNumber() 메서드를 호출한 결과가 일원화되어
            시리얼넘버가 부여된다는 점입니다.
         */
    }
}
