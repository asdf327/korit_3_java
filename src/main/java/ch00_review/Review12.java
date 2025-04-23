package ch00_review;

class Student{
    public String name;
    public int age;
    int studentId;
    private String password;

    public void showInfo(){
        System.out.println("학번 : " + studentId);
        System.out.println("이름 : " + name );
        System.out.println("나이 : "+ age);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class Review12 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "김일"; //외부 접근 가능
        student.age = 17;
        student.studentId = 20250001; // 같은 패키지라 접근 가능
        student.showInfo();

        student.setPassword("qwer1234");
        System.out.println(student.getPassword());
    }
}
