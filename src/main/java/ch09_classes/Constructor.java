package ch09_classes;
/*
    생성자는 객체가 생성되었을 때 호출되는 특별한 메서드
    클래스명 + 객체명 + new 클래스명();
    클래스()가 생성자

    특징
    1. 클래스의 이름과 생성자의 이름은 같다
    2. return 값이 없다 -> call1(), call2() 유형으로 볼 수 있다
    3. 객체 초기화 : 생성자는 객체의 필드 초기화 담당

    생성자의 정의 방식
    1. 기본 생성자 : 매개변수가 없는 생성자
    2. 매개변수 생성자 : 하나 이상의 매개변수를 가지는 생성자
 */
public class Constructor {
    //필드 선언
    int num;
    String  name;

    //기본 생성자 정의 -> 직접하면 메서드 [입력값 x |출력값 x]
    Constructor(){
        System.out.println("기본 생성자");
    }

    //매개변수 생성자 > 기본적으로 만들어지지 않음, 개발자가 정의해야 함
    // 그 경우 기본 생성자와 매개 변수 생성자를 동시에 써야함
    //디본 생성자도 정의해야 한다
    Constructor(int number){
        System.out.println("매개변수를 필수로 요구하는 생성자");
        this.num = number; //this : 해당 클래스에서 객체를 만들게 되면 객체 이름으로 대체
    }
}
