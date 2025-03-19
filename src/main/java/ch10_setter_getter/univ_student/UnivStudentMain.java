package ch10_setter_getter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent student1 = new UnivStudent();
        UnivStudent student2 = new UnivStudent();
        UnivStudent student3 = new UnivStudent();
        UnivStudent student4 = new UnivStudent();
        UnivStudent student5 = new UnivStudent();
//        System.out.println(student2.getScotr());
//        System.out.println(student3.getGrade());

        student1.setName("김일");
        student1.setGrade(1);
        student1.setScotr(3.3);

        student2.setName("김이");
        student2.setGrade(3);
        student2.setScotr(-30);
        student2.setScotr(4.0);

        student3.setName("김삼");
        student3.setGrade(5);
        student3.setGrade(2);
        student3.setScotr(2.7);

        student4.setName("김사");
        student4.setGrade(4);
        student4.setScotr(3.8);

        student5.setName("김오");
        student5.setGrade(2);
        student5.setScotr(2.0);

        student1.UnivStudent1();
        student2.UnivStudent1();
        student3.UnivStudent1();
        student4.UnivStudent1();
        student5.UnivStudent1();
    }
}
