package ch00_matte;

public class Main01 {
    public static void main(String[] args) {
        Student02 student02 = Student02.builder()
                .name01("홍길동")
                .age01(20)
                .studentId(2023001)
                .build();

        Student02 student03 = Student02.builder()
                .name01("김영희")
                .age01(21)
                .studentId(2023002)
                .build();

        System.out.println(student02);
        System.out.println(student03);
    }
}
