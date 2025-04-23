package ch00_matte;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter @Setter
public class Student02 {
    String name01;
    int age01;
    int studentId;
}
