package ch00_matte.zoo;

public class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("멍멍");
    }

    public void fetch(){
        System.out.println("강아지가 공을 물어옵니다");
    }
}
