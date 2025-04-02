package ch21_exception.practice;

public class Car {
    private String color;
    private String engineType;
    private int numWheels;
    private boolean hasSunroof;
    private boolean hasGPS;

    public Car setColor(String color){
        this.color = color;
        return this;
    }
}
