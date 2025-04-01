package ch19_collrctions;
/*
    리스트는 순서가 있고 중복을 허용하지만 Set는 순서가 없고 중복을 허용하지 않는다
    List -> set / Srt -> list로의 형변환이 중요
    List를 통해 전체 설문을 받고 Set를 통해 중복을 제여 남기는 등 여러 형태로 사용
    Set로 제거하고 .get(인덱스 넘버)로 조회 가능
 */

import java.util.*;

public class strSet {
    public static void main(String[] args) {
        //Set 객체 생성
        Set<String> strSrt = new HashSet<>();
        //List 객체 생성
        List<String> strList = new ArrayList<>();

        //Set에 배열 삽입 -> .add()
        strSrt.add("java");
        strSrt.add("java");
        strSrt.add("java");
        strSrt.add("1");
        strSrt.add("1");
        strSrt.add("1");
        strSrt.add("1");

        System.out.println(strSrt); //순서를 보장 X

        //특벙 배열 추출 -> List로의 형변환
        strList.addAll(strSrt);
        //List 바꿨으니 요소 추출이 가능

        for (int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i));
        }

        Collections.sort(strList);

        for (String elem : strSrt){
            System.out.println(elem);
        }

        //리스트 정렬한 버전을 set에 저장하기 위해 추가적으로 선언
        strSrt.addAll(strList);
        System.out.println(strSrt);
    }
}
