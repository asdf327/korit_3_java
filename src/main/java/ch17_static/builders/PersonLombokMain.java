package ch17_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok personLombok1 = PersonLombok.builder()
                .name("김일")
                .age(19)
                .address("부산역시 부산진구")
                .build();

        System.out.println(personLombok1.getName());
        System.out.println(personLombok1.getAge());
        System.out.println(personLombok1.getAddress());

        PersonLombok personLombok2 = PersonLombok.builder()
                .name("김이")
                .build();
        personLombok2.setAge(89);
        personLombok2.setAddress("경상남도 양산시");

        System.out.println(personLombok2);

        PersonLombok personLombok3 = PersonLombok.builder()
                .name("김삼")
                .age(21)
                .build();
        personLombok3.setAddress("광주광역시 북구");
        System.out.println(personLombok3);

        PersonLombok personLombok4 = PersonLombok.builder()
                .name("김사")
                .age(39)
                .address("서울 특별시 마포구")
                .build();
        System.out.println(personLombok4);
    }
}
