package ch12_inheritance;

public class Animal {
    //필드 생성
    private String animaNsme;
    private int animaAge;

    //생성자 자동 생성

    public Animal(String animaNsme, int animaAge) {
        this.animaNsme = animaNsme;
        this.animaAge = animaAge;
    }

    public Animal(int animaAge) {
        this.animaAge = animaAge;
    }

    public Animal(String animaNsme) {
        this.animaNsme = animaNsme;
    }

    public Animal() {
    }

    //settet

    public void setAnimaNsme(String animaNsme) {
        this.animaNsme = animaNsme;
    }

    public void setAnimaAge(int animaAge) {
        this.animaAge = animaAge;
    }

    //getter

    public String getAnimaNsme() {
        return animaNsme;
    }

    public int getAnimaAge() {
        return animaAge;
    }

    //메서드
    public void move(){
        System.out.println("움직임입니다");
    }
}
