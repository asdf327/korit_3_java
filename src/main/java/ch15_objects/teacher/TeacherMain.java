package ch15_objects.teacher;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김미진", "부산고등학교");
        Teacher teacher2 = new Teacher("김미진", "부산고등학교");

        boolean re1 = teacher1.equals(teacher2);
        System.out.println(re1); //true
        boolean re2 = teacher1 == teacher2;
        System.out.println(re1); //true

    }
}
