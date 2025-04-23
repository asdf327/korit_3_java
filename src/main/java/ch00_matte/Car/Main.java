package ch00_matte.Car;

public class Main {
    public static void main(String[] args) {
        Center center = new Center(new Motors(), new Hyundai());

        center.run();
        center.stops();

        center.runGo();
        center.stopsNo();
    }
}
