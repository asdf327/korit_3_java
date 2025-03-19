package ch10_setter_getter;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    Person(String name) {
        this.name = name;
    }

    public Person(int age1) {
        if (age1 < 0 || age1 > 200){
            System.out.println("틀린 나이 입력 ");
            return; //메서드 내에 리턴하면 그대로 종료
        }
        System.out.println("나이");
        System.out.println("변경 전 나이" + this.age);
        this.age = age1;
        System.out.println("변경 후 나이" + age);

        this.age = age1;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Setter의 명칭:set + 필드명으로 짒는 편
    //구조 : call2() 유형으로 정

    public void setAge(int age1) {
        if (age1 < 0 || age1 > 200){
            System.out.println("틀린 나이 입력 ");
            return; //메서드 내에 리턴하면 그대로 종료
        }
        System.out.println("나이");
        System.out.println("변경 전 나이" + this.age);
        this.age = age1;
        System.out.println("변경 후 나이" + age);
    }
    //속성과 매개변수는 다름

    //Gatter : ger + 필드명
    //구조 : call3() -> 매개변수 없음 / return 있음
    //데이터의 조회만 하면 되기 때문에 매개 변수가 요귀되지 않음
    //필드와 동일한 자료형의 return
    public void getName(String name){
        //이름의 글자 수가 4초과라면 입력이 불가능 하게씀
        if (name.length() > 5){
            System.out.println("4글자 초과");
            return;
        }
        System.out.println("이름");
        System.out.println("변경 전 이름 " + this.name);
        this.name = name;
        System.out.println("변경 후 이름 " + this.name);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
