package ch00_matte.Car;

public class Center {
    private Motors motors;
    private Hyundai hyundai;

    public Center(Motors motors, Hyundai hyundai) {
        this.motors = motors;
        this.hyundai = hyundai;
    }

    public void run(){
        motors.start();
    }

    public void stops(){
        motors.stop();
    }

    public void runGo(){
        hyundai.start();
    }

    public void stopsNo(){
        hyundai.stop();
    }
}
