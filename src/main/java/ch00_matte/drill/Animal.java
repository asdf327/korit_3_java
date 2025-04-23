package ch00_matte.drill;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("동물이 소리를 냅니다.");
    }
}
