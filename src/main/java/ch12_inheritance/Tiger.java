package ch12_inheritance;

public class Tiger extends Animal{ //자식 클래스명 extends 부모 클래스명

    public Tiger() {
    }

    public Tiger(String animaNsme) {
        super(animaNsme); //super 키워드
    }

    public Tiger(int animaAge) {
        super(animaAge);
    }

    public Tiger(String animaNsme, int animaAge) {
        super(animaNsme, animaAge);
    }

    @Override
    public void setAnimaNsme(String animaNsme) {
        super.setAnimaNsme(animaNsme);
    }

    @Override
    public void setAnimaAge(int animaAge) {
        super.setAnimaAge(animaAge);
    }

    @Override //Override 붙으면 해당 메서드를 상속받음
    public String getAnimaNsme() {
        return super.getAnimaNsme(); //super.메서드명()
    }

    @Override
    public int getAnimaAge() {
        return super.getAnimaAge();
    }

    @Override
    public void move() {
        super.move();
        System.out.println("네 발로 움직입니다"); //재정의 파트
    }

    // Tiger 클래스만의 고유의 메소드 가능
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니디");
    }
}
