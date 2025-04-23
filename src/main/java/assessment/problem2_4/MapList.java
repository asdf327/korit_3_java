package assessment.problem2_4;

import java.util.*;

public class MapList {

    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("rating", "vip");
        map.put("age", "30");
        customers.add(map);

        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "김기영");
        map1.put("rating", "gold");
        map1.put("age", "35");
        customers.add(map1);

        for (Map<String, Object> customer : customers){
            System.out.println("name = " + customer.get("name"));
            System.out.println("rating = " + customer.get("rating"));
            System.out.println("age = " + customer.get("age"));
        }
    }
}
