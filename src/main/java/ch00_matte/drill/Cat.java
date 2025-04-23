package ch00_matte.drill;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("야옹");
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", 나이 : " + age;
    }
}
