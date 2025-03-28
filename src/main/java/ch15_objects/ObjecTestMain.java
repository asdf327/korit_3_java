package ch15_objects;

public class ObjecTestMain {
    public static void main(String[] args) {
        String strExample1 = "안근수";
        String strExample2 = new String("안근수");

        boolean re = strExample1 == strExample2;
        System.out.println(re); //false
        boolean re2 = strExample1.equals(strExample2);
        System.out.println(re2); //true

        ObjecTest objecTest = new ObjecTest("안근수", "부산광역시 연제구");
        objecTest.displayInfo1();

        ObjecTest2 objecTest2 = new ObjecTest2();

        objecTest2.setName("김미진");
        objecTest2.setAddress("부산광역시 사하구");
        System.out.println(objecTest2.displayInfo2());

        System.out.println(objecTest2);

        Teacher teacher = new Teacher("김미진", "다대고등학교");
        System.out.println(teacher);
    }
}
