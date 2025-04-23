package ch13_abstraction.adstract_class;

public abstract class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    //메서드 정의
    public abstract void name();
    public abstract void produce(String model);
    //public "abstract" class Factory
    //public "abstract" void produce();
    /*
        접근 지정자와 리턴 타입 사이에 명시가 되면, 클래스도 동일한 접근 지정자와 class 사이에 abstract가 있어야만 한다
     */
    //일반 메서드를 못쓰는 것이 아니기 때문에


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 우리가 직접 타이핑하는 일반 메서드
    public void displayInfo() {
        System.out.println("공장의 정보를 출력합니다.\n공장 이름 : " + name);
    }
}
