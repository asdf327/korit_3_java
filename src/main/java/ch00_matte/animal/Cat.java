package ch00_matte.animal;

import lombok.ToString;

@ToString
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("고양이가 음식을 먹습니다.");
    }
}
