package ch11_access_modifier;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("1");
        System.out.println(person.getName());
        person.setName("2");
        System.out.println(person.getName());
    }
}
