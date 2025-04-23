package ch13_abstraction.Car;

public class Main {
    public static void main(String[] args) {
        CarStarter carStarter = new CarStarter(new GasCar(), new ElectricCar());

        carStarter.startCar();
        carStarter.stopCar();
        carStarter.accelerate();
        carStarter.brake();
    }
}
