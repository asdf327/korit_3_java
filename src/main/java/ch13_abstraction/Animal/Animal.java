package ch13_abstraction.Animal;

public abstract class Animal {
    public abstract void makeSound();

    public void eat(){
        System.out.println("동물이 먹이를 먹습니다.");
    }
}
