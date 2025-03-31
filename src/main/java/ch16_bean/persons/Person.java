package ch16_bean.persons;

public class Person {
    //필드 선언
    //접근 지정자와 자료형 final 사이에 명시하는 경우

    //name에 final을 선언하면 오류가 난다. 이때 NAME = "데이터"로 초기화하거나
    //final을 붙은 필드를 필수적으로 포함하는 매개변수 생성

    private final String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
