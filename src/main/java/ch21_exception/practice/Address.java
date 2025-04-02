package ch21_exception.practice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Address {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        Person person = new Person("김미진", 27, "alwls@name.com");
        String josn = gson1.toJson(person);
        System.out.println(josn);

        JsonObject jsonObject = gson.fromJson(josn, JsonObject.class);
        System.out.println(jsonObject);
    }
}
