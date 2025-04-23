package ch16_bean;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserEntityLombok {
    private int username;
    private int password;
    private String email;
    private String name;

}
