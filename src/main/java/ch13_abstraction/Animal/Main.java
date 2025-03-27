package ch13_abstraction.Animal;

public class Main {
    Animal animal1 = new Animal() {
        @Override
        public void makeSound() {
            System.out.println("동물이 먹이를 먹습니다.");
        }
    };



}
