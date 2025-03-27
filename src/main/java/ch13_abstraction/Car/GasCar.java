package ch13_abstraction.Car;

public class GasCar implements Ignition, Car{
    @Override
    public void start() {
        System.out.println("가솔린차 시동을 켭니다.");
    }

    @Override
    public void stop() {
        System.out.println("가솔린차 시동을 끕니다.");
    }

    @Override
    public void accelerate() {
        System.out.println("가솔린차가 가속합니다.");
    }

    @Override
    public void brake() {
        System.out.println("가솔린차가 제동을 밟습니다.");
    }
}
