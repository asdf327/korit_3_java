package ch00_matte.Car;

public class Motors extends Car {
    @Override
    public void start() {
        System.out.println("삼성 자동차가 달립니다");
    }

    @Override
    public void stop() {
        System.out.println("삼성 자동차가 멈춥니다");
    }
}
