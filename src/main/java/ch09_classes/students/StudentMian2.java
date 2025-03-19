package ch09_classes.students;

public class StudentMian2 {
    public static void main(String[] args) {
        Student2 student1 = new Student2();
        Student2 student2 = new Student2(2025002);
        Student2 student3 = new Student2("김삼");
        Student2 student4 = new Student2("김사", 2025004);
        Student2 student5 = new Student2(2025005,"김오",80.7);

        System.out.println();

        student1.studentCode = 2025001;
        student1.name = "김일";
        student1.score = 4.5;
        student1.StudentMat1();

        student2.name = "김이";
        student2.score = 100;
        student2.StudentMat1();

        student3.studentCode = 2025003;
        student3.score = 95.8;
        student3.StudentMat1();

        student4.score = 4.0;
        student4.StudentMat1();

        student5.StudentMat1();
    }
}
