package ch00_matte;

public class Student01 {
    String name01;
    int age01;
    int studentId;

    public Student01(String name, int age01, int studentId) {
        this.name01 = name;
        this.age01 = age01;
        this.studentId = studentId;
    }

    public void setName01(String name01) {
        this.name01 = name01;
    }

    public void setAge01(int age01) {
        this.age01 = age01;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void printInfo(){
        System.out.println("\n이름: " + name01 + "\n나이: " + age01 + "\n학번: " + studentId);
    }

    public static void main(String[] args) {
        Student01 student01 = new Student01("홍길동", 20, 2023001);
        student01.printInfo();

        student01.setName01("김영희");
        student01.setAge01(21);
        student01.setStudentId(2023002);

        student01.printInfo();
    }
}
