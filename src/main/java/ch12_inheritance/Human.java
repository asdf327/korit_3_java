package ch12_inheritance;

public class Human extends Animal {
    //상속을 받게 되면 Animal 클래스 필드 사용 가능
    //고유 메서드처럼 고유 속성도 가질 수 있음
    String SmartPhone;


    //생성자 생성
    public Human(String animaNsme, int animaAge, String SmartPhone) {
        super(animaNsme, animaAge); //부모 필드를 그대로 대입하는 것
        this.SmartPhone = SmartPhone;
    }

    public Human(int animaAge) {
        super(animaAge);
    }

    public Human(String animaNsme) {
        super(animaNsme);
    }

    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    @Override
    public void setAnimaNsme(String animaNsme) {
        super.setAnimaNsme(animaNsme);
    }

    @Override
    public void setAnimaAge(int animaAge) {
        super.setAnimaAge(animaAge);
    }

    @Override
    public String getAnimaNsme() {
        return super.getAnimaNsme();
    }

    @Override
    public int getAnimaAge() {
        return super.getAnimaAge();
    }

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String book){
        System.out.println(getAnimaAge() + "은 " + book + "를 읽는 중입니다.");
    }

    public void setSmartPhone(String smartPhone) {
        SmartPhone = smartPhone;
    }

    public String getSmartPhone() {
        return SmartPhone;
    }
}
