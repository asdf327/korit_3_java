package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();
        //속성(키-값 쌍)을 추가하는 메서드 -> addProperty();
        jsonObject.addProperty("유저", 1 );
        jsonObject.addProperty("패스워드", 1234 );
        jsonObject.addProperty("이메일", "c@" );
        jsonObject.addProperty("이름", "김일" );

        System.out.println(jsonObject);
        //{"유저":1,"패스워드":1234,"이메일":"c@","이름":"김일"}
        /*
            차이범
            1. Map에서 키 부분에 "" 없다, JSON에서는 키가 String 자료형처럼 보이도록 ""가 있다
            2. Map에서는 키1=값1의 형태로 작성
            JSON에서는 키1:값1의 형태로 작성
         */

        jsonObject.addProperty("iop", "코리아아이티아카데미");
        System.out.println(jsonObject);

        //가독성이 좋지 않기에 Gson 사용
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // 를 prettyPrintibg이 적용된 JSON 문자열로 반환
        String josn = gson.toJson(jsonObject);
        System.out.println(josn);
    }
}
