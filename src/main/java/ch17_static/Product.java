package ch17_static;

import lombok.Getter;

@Getter //여기에 @Getter를 다는 것은 static 메스드와 관계없음
public class Product {
    //필드 선언
    //static 변수(정적 변수) 선언 및 초기화
    @Getter //필드 레벨에서의 겟터
    private static int count = 0;
    //롱복을 사용하지 않은 static 선언
    private static String title = "제품입니다";
    //메서드 정의시에 static가 들어가면 된다(ghcnftldpsms Product.getTitle())
    public static String getTitle(){
        return title;
    }
    //멤버 변수 선언 및 초기화
    private int instanceCount = 0; //변수인데 여기서 초기화

    public Product(){
        System.out.println("Product 클래스의 인스턴스 생성");
        count++;
        instanceCount++;
    }
}
