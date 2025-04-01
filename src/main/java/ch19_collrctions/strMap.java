package ch19_collrctions;

import java.util.*;

public class strMap {
    public static void main(String[] args) {
        Map<String, String> strMap = new HashMap<>();

        //키와 값을 삽입 -> .put(키, 값);
        strMap.put("2025", "김미진, 28");
        strMap.put("2026", "김미진, 29");
        strMap.put("2027", "김미진, 30");
        strMap.put("2028", "김미진, 31");
        strMap.put("2029", "김미진, 33");
        System.out.println(strMap);
        //특징 중 하나로 하나의 키엔느 하나의 밸류(값)만 존재하기에, 만약에 키가 겹친다면 가장 최근의 밸류에 덮어씀

        //특정 키의 값 조회
        System.out.println(strMap.get("2028")); //값만 튀어나옴

        //특정 키의 값 수정 #1 -> .put를 통해서 덮어 씀
        strMap.put("2025", "김이");
        System.out.println(strMap.get("2025"));

        //특정 키의 값 수정 #1 -> .get
        strMap.replace("2026", "33");
        System.out.println(strMap.get("2026"));

        //특정 키의 존재 여부 -> .containsKey
        boolean flag1 = strMap.containsKey("2500");
        System.out.println("2500 키의 존재 이유 : " + flag1);

        //특정 키의 존재 여부 -> .containsValue
        boolean flag2 = strMap.containsValue("2025");
        System.out.println("2025 키의 존재 이유 : " + flag2);

        //Map의 엔트리(키 + 값 통칭)로부터 Set 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>(); //비어있는 set 생성
        Set<Map.Entry<String, String>> entrySet2 = strMap.entrySet();
        System.out.println(entrySet1);
        System.out.println(entrySet2);
        //[2029=김미진, 33, 2028=김미진, 31, 2027=김미진, 30, 2026=33, 2025=김이]
        //를 기준으로 배열 개수가 뉜다는 점을 고려하면 키=배열 하나가 set 배열이 된다

        List<Map.Entry<String, String>> entryList = new ArrayList<>(); //비어있는 List 선언
        entryList.addAll(entrySet2); //바로 Map -> List 불가능, Set를 경유해야만 함
        System.out.println(entryList);

        //Map Set 출력 -> strMap 제네릭
        Set<String> keySet = strMap.keySet();
        System.out.println(keySet);

        Collection<String> values = strMap.values();
        System.out.println(values);
        //키는 중복이 불가능하기 때문에 Set를 쓴다
        // 하지만 values는 중복이 허용되기 떼문에 Set을 썼을 때 중복 제거로 인해
        // 키의 개수와 값의 개수가 달라질 위험이 있어 Collection 사용


    }
}
