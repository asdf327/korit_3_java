package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person(-10); //깂은 들어가지 않았지만 객체가 생성됨
        Person person1 = new Person("레오나르도 디카프리오");
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
//        person.name = "안근수";
//        System.out.println(person.name);
//        System.out.println(person.age);
//        person.age = 30; //private 적용 후 오류 발생

        //메서드 호출 방식 : 객체명.메서드명();
        person.setAge(38);
//        person.setAge(300);

        person1.getName("김미진");
    }
}
