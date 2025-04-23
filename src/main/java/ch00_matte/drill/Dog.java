package ch00_matte.drill;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", 나이 : " + age;
    }

    @Override
    public void speak() {
        System.out.println("멍멍");
    }
}
