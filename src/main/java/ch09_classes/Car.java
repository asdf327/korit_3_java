package ch09_classes;

public class Car {
    //필드
    String color;
    int speed;

    //메서드
    void drive(){
        System.out.println(color + " 자동차가 주행합니다");
    }

    void brake(){
        System.out.println(color + " 자동차가 멈춤니다");
    }

    void display(){
        System.out.println("이 차의 색은 " + color + "이고, ");
        System.out.println("최고 속도는 " + speed);
    }
}
