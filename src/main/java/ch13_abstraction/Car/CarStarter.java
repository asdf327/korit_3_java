package ch13_abstraction.Car;

public class CarStarter {
    private GasCar gasCar;
    private ElectricCar electricCar;

    public CarStarter(GasCar gasCar, ElectricCar electricCar) {
        this.gasCar = gasCar;
        this.electricCar = electricCar;
    }

    public void startCar(){
        gasCar.start();
        electricCar.start();
    }

    public void stopCar(){
        gasCar.stop();
        electricCar.stop();
    }

    public void accelerate(){
        gasCar.accelerate();
        electricCar.accelerate();
    }

    public void brake(){
        gasCar.brake();
        electricCar.brake();
    }
}
