package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
//        기본 생설자를 통한 객체 생성
        Constructor constructor1 = new Constructor();
//        Constructor constructor1 = new Constructor(11,"김이진");
////        System.out.println(constructor1.num);
////        System.out.println(constructor1.name);

        //매개변수 생성자를 통한 객체 생성
        Constructor constructor2 = new Constructor(20);
        System.out.println(constructor2.num);
//        Constructor constructor2 = new Constructor(20, "페페론치노");
//        System.out.println(constructor2.num);
//        System.out.println(constructor1.name);

        //객체 생성
        Constructor constructor3 = new Constructor(11,"오일남");

        Constructor constructor4 = new Constructor("김미진",22);
        System.out.println(constructor4.title);

        constructor1.sh();
        constructor2.sh();
        constructor3.sh();
        constructor4.sh();

        System.out.println();

        constructor1.num = 1;
        constructor1.name = "김일남";

        constructor2.name = "김이남";

        constructor1.sh();
        constructor2.sh();
        constructor3.sh();
        constructor4.sh();
    }
}
