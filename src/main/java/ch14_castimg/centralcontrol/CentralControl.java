package ch14_castimg.centralcontrol;

public class CentralControl {
    //필드 선언
    private Power[] deviceArray;

    //생성자
    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    //CentralControl의 객체의 핑드인 배열에 집어넣는 메서드
    public void addDevice(Power device){
        //통제하기 위해 Power 사용
        int emty = checkEmpty();
        if (emty == -1){
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emty] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다");
        /*
            객체명.getClass() -> 패키비 명을 포함한 클래스명을 출력하는 겟터
            객체명.getClass().getSimpleName() -> 클래스명만 출력하는 겟터
         */
    }

    //배열의 갯수는 정해졌지만 객체가 그보다 많기 때문에 메서드 하나를 정의
    private int checkEmpty(){ //비어있는 배열에 index 넘버롷 반환
        //반복문
        for (int i = 0; i < deviceArray.length; i++){
          if (deviceArray[i] == null){
              return i;
          }
        }
        return -1;
        /*
            음수값은 없기 때문에 실팰를 나타낼 때 -1을 쓰는 경우가 많다.
         */
    }

    public void powerOn(){
        //배열 내부에 있는 업캐스팅들을(Power의 서브 클래스들의 인스턴스) Power를 interface했기 때문에 전부 .on .off를 공통적으로 가짐
        for (Power device : deviceArray){
            if (device == null){
                System.out.println("장치가 없어 전원이 켜지지 않습니다");
                continue; //다음 반복문으로 건너뛰는 명령어/ break;, return;과 비교할 것
            }
            device.on();
        }

//        for (int i =0; i<deviceArray.length; i++){
//            deviceArray[i].on();
//        } //위의 반복문과 같음
    }

    //off 버전 정리
    public void powerOff(){
        for (int i = 0; i < deviceArray.length; i++){
            if (deviceArray[i] == null){
                System.out.println("장치가 없어 전원이 끄지 못합니다");
            } else {
                deviceArray[i].off();
            }
        }
    }

    //배열 내에 각 객체들이 들어 있는데 객체명.getClass().getSimpleName()을 활용하면 클래스명이 출력된다

    public void displayInfo(){
        for (int i = 0 ; i < deviceArray.length; i++){
            if (deviceArray[i] != null) {
                System.out.println("슬롯 [" + (i + 1) + "] 번 : " + deviceArray[i].getClass().getSimpleName());
            } else {
                System.out.println("슬롯 [" + (i+1) + "] 번 : Empty ");
            }
        }
    }

    //배열 내부를 돌면서 고유 메서드를 호출하는 메세드
    public void perform(){
        for (Power device : deviceArray){
            if (device instanceof Tv){ //실행되면 Tv 클래스 생성되었다가 Power로 업캐스팅
                Tv tv =(Tv) device; //다운 캐스팅은 명시적이어야 하기 때문에
                tv.changeChannel();
            } else if (device instanceof  Computer){
                Computer computer = (Computer) device;
                computer.compute();
            } else if (device instanceof LED){
                LED led = (LED) device;
                led.changeColor();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if (device instanceof Speaker){
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device == null){ //장치가 비어있을 때 실행
                System.out.println("장치가 비어있습니다.");
            }

            else { // 아직 instanceof 연산자로 추가하지 못한 클래스 실행
                System.out.println("아직 지원하지 않은 기기입니다.");
            }
        }
    }


}
