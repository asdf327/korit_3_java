package ch15_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김미진", "부산고등학교");
        Teacher teacher2 = new Teacher("김미진", "부산고등학교");

        boolean re1 = teacher1.equals(teacher2);
        System.out.println(re1); //true -> 주소지까지 같은지를 확인
        boolean re2 = teacher1 == teacher2;
        System.out.println(re2); //false ->객체 상에서의 .equals() 주소지가 아니라 속성값이 같은지 확인

        Class tClass = teacher1.getClass();
        System.out.println(tClass); //class ch15_objects.teacher.Teacher
        System.out.println(teacher1.getClass().getSimpleName()); //Teacher
        System.out.println(tClass.getSimpleName()); //Teacher

        Field[] field = tClass.getDeclaredFields();
        System.out.println(field);
        for (int i = 0; i < field.length; i++){
            System.out.println("필드명 출력 : " + field[i].getName());
            System.out.println("패키지 + 클래스명" + field[i].getType());
            System.out.println("클래스명" + field[i].getType().getSimpleName());
        }

        System.out.println();

        Class tClass2 = teacher2.getClass();
        Field[] field2 = tClass2.getDeclaredFields();
        for (Field field1 : field2){
            System.out.println("필드명 출력 : " + field1.getName());
            System.out.println("패키지 + 클래스명 : " + field1.getType());
            System.out.println("클래스명 : " + field1.getType().getSimpleName());
        }

        System.out.println();

        Method[] methods = tClass.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++ ){
            System.out.println("매서드 출력 : " + methods[i].getName());
            System.out.println("리턴 타입 출력 : " + methods[i].getReturnType());
        }

        System.out.println();

        for (Method method : methods){
            System.out.println("매서드 출력 : " + method.getName());
            System.out.println("리턴 타입 출력 : " + method.getReturnType());
        }

        ch15_objects.Teacher teacher3 = new ch15_objects.Teacher("안근수", "코리아");
//        System.out.println(teacher3 instanceof Teacher); //오류 발생
        //teacher3의 경우 다른 경로의 Teacher 클래스의 인스턴스이기 때문에 오류 발생

//        String[] str = {"안녕하세요","안녕하세요"};
//        boolean re3 = str[0].equals(str[1]); //true
//        System.out.println(re3);
//        boolean re4 = str[0]== str[1];
//        System.out.println(re4); //true
//
//        String[] str2 = {"안녕하세요","안녕하세요"};
//        boolean re6 = str[0].equals(str2[1]);
//        System.out.println(re6); //true
//        boolean re5 = str[0] == str2[1];
//        System.out.println(re5); //true

    }
}
