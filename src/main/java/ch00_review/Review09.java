package ch00_review;

/*
    겟터 / 셋터

    객체명.속성명 = 석상값;의 형태로 여태까지 대입 바뀜
    그래서 인스에 마이너스값을 집어넣어도 대입되는 문제가 있었음
    그래서 악의적으로 클래스 외부에서 데이터 조작이 가능
    이를 막기위해 다른 클래스에서 직접적으로 속성값을 바꾸는 것을 막고 큭정 메서스를 경유해야만
    속성값을 대입할 수 있도록 처리하는 것이 겟터와 셋터

    1. Satter : 속성값을 대입(변경)하기 위한 메서스를 통칭
        set+속성명
        a. call2() 유형
        b. 내부 로직을 작성하여 필드의 논리적인 개념에 맞지 않게
        데이터를 걸러낼 수 있다(배터리차입이 음수면 매서드 정지시킬 수 있음)
    2. 속성값을 조회하기 위한 메서스의 통칭
        grt+속성명
        a. call3() 유형
        b. 메서스 단계에서 데이터 조회시 조작 가능
        셋터와 마찬가지로 alt + ins를 통해 만들 수 있음

 */

class SmartWatch{
    private boolean button;
    private boolean callular;
    private int batteryTime;
    private String title;

    //생성자
//    public SmartWatch() {
//    }
//
//    public SmartWatch(String title) {
//        this.title = title;
//    }


    //Setter
    public void setButton(boolean button){
        this.button = button;
    }

    public void setCallular(boolean callular){
        this.callular = callular;
    }

    public void setbatteryTime(int batteryTime){
        if(batteryTime < 10){
            System.out.println("10 미만이 될 수 없습니다");
        }
        this.batteryTime = batteryTime;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getBatteryTime(){
        return batteryTime;
    }

    void showInfo(){
        System.out.println("\n이 시계는 " + title + "입니다. 배터리타임이 " + batteryTime + "이지요.");
        System.out.println("감사합니다.");
    }
}

public class Review09 {
    public static void main(String[] args) {
        SmartWatch watch1 = new SmartWatch();

        watch1.setButton(true);
        watch1.setCallular(true);
        watch1.setbatteryTime(-10);
        watch1.showInfo();
        watch1.setbatteryTime(18);
        watch1.setTitle("애플워치");
        watch1.showInfo();
    }
}
