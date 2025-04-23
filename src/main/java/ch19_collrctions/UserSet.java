package ch19_collrctions;

import java.util.HashMap;
import java.util.Map;

public class UserSet {
    public static void main(String[] args) {
        Map<String, String> userSet = new HashMap<>();

        userSet.put("username", "1");
        userSet.put("pd", "1234");
        userSet.put("email", "c@test.com");
        userSet.put("name", "김일");

        System.out.println(userSet);

    }
}
