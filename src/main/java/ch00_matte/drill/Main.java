package ch00_matte.drill;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("뽀삐", 3);
        Dog dog = new Dog("야옹이", 2);

        cat.speak();
        dog.speak();

        System.out.println(cat);
        System.out.println(dog);
    }
}
