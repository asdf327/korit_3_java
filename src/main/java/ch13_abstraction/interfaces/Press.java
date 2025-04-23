package ch13_abstraction.interfaces;

public interface Press {

    String NAME = "button";
    /*
       인터페이스이기 때문에 변수 앞에 접근 지정자를 명시하지 않으면 public이 생략됨
       상수이기 때문에 대문자 변경
       일반 클래스의 경우 String name 불가능하여 초기화 필수

       안 되는 것 :
       String name;
       public Press(); -> 인터페이스는 생성자 생성 불가
        void popOut(){
        System.out.println("추상 메서드 x 일반 메서드 o");
    }
     */

    // 되는 것
    void onPressed();

}
