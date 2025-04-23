package ch16_bean.persons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PersonLombok {
    @NonNull //필드 레벨의 애너테이션
    private final String name; // name는 비울 수 없다는 뜻
    private int age;

    //Lombok을 통해 final 해결
    //RequiredArgsConstructor는 필드의 final을 감지해서 메개변수 생성자를 자동으로 만든다

    //그리고 @Data로 수정하면 @Setter / @Getter / @RequiredArgsConstructor / @ToString / @EqualsAndHashCode 포함된다


    @Override
    public String toString() {
        return "이름 : " + name +
                " 나이 : " + age;
    }
}
