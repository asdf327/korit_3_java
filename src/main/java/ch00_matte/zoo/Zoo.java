package ch00_matte.zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.speak();
        animal2.speak();

        Dog dog = (Dog) animal1;

        dog.fetch();
    }
}
