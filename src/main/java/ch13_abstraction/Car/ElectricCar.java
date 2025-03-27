package ch13_abstraction.Car;

public class ElectricCar implements Ignition, Car{
    @Override
    public void start() {
        System.out.println("전기차 시동을 켭니다.");
    }

    @Override
    public void stop() {
        System.out.println("전기차 시동을 끕니다.");
    }

    @Override
    public void accelerate() {
        System.out.println("전기차가 가속합니다.");
    }

    @Override
    public void brake() {
        System.out.println("전기차가 제동을 밟습니다.");
    }
}
