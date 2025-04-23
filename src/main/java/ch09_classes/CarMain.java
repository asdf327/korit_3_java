package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car myCat = new Car();
        myCat.color = "빨강";
        myCat.speed = 160;

        Car yourCar = new Car();
        yourCar.color = "노랑";
        yourCar.speed = 180;

        myCat.drive();
        yourCar.brake();
        myCat.display();
        yourCar.display();
    }
}
