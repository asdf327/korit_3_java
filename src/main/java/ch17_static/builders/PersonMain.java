package ch17_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        // 지금까지의 방법
//        Person person = new Person("안근수",38,"부산");

        Person person1 = new Person.Builder()
                .name("김미진")
                .age(30)
                .address("부산")
                .build();

        System.out.println(person1);
    }
}
