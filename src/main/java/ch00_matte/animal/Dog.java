package ch00_matte.animal;

import lombok.ToString;

@ToString
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("강아지가 음식을 먹습니다.");
    }
}
