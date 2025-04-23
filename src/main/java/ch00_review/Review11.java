package ch00_review;

import java.util.Scanner;

class User{
    public String name;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class Review11 {

    public static void main(String[] args) {
        User user1 =new User();
        //name 필드와 password 필드에 각각 다른 방법으로 데이터를 대입해야 함
        //public/private라는 접근 지정자 차이 때문에 생겨남

        //1. name 필드 값 대입 : public이라서 접근 가능
        user1.name = "user1";
        System.out.println(user1.name);

        //2. password 필드 값 대입 : private이기 때문에 메소드로 우회해야함
        user1.setPassword("password");
        System.out.println(user1.getPassword());
    }
}
