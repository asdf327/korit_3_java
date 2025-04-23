package ch14_castimg.centralcontrol;

public class Main {
    public static void main(String[] args) {
        //각 클래스의 객체를 생성
        Computer computer1 =new Computer();
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();
        Tv tv = new Tv();
        Speaker speaker = new Speaker();
        SmartPhone smartPhone = new SmartPhone();

        CentralControl centralControl = new CentralControl(new Power[7]);

        centralControl.addDevice(computer1); //업캐스팅이 암시적으로 일어남
        centralControl.addDevice(led1);
        centralControl.addDevice(mouse1);
        centralControl.addDevice(tv);
        centralControl.addDevice(speaker);
        centralControl.addDevice(smartPhone);

        System.out.println();

        centralControl.powerOn();
        System.out.println();
        centralControl.powerOff();
        System.out.println();

        centralControl.displayInfo();

        System.out.println();

        centralControl.perform();
    }

}
