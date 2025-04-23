package ch16_bean.persons;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person(20, "김일");
        Person person2 = new Person( "김이"); //final 때문에 필수

        person2.setAge(30);

        System.out.println(person);
        System.out.println(person2);

        PersonLombok person3 = new PersonLombok("김삼");
        PersonLombok person4 = new PersonLombok("김사",14);

        System.out.println(person3);
        System.out.println(person4);

        //이상을 실행시켰을 때 person, person2와 person3, person4가 출력되는 방식이 다르다
        //이는 intellij(혹은 Java)자체에서의 toString()의 재정의한 default 방식과  project Lombok 상에서의 toString() 메서드의 재정의 방식이 차이가 나기 때문

//        PersonLombok person5 = new PersonLombok(); //필드의 @NonNull 때문에 오류 발생
    }
}
