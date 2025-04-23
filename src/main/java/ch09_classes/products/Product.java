package ch09_classes.products;

public class Product {
    int productNum;
    String productName;

    Product(){
        System.out.println("기본 생성자를 사용하여 객체를 생성하세요 product1");
    }

    Product(int productNum){
        System.out.println("시리얼 넘버를 기본으로 입력하는 매개변수 생성자를 통해 객체를 생성하시오.");
        this.productNum = productNum;
    }

    Product(String productName){
        System.out.println("제품명을 기본으로 입력하는 매개변수 생성자를 통해 객체를 생성하시오.");
        this.productName = productName;
    }

    Product(int productNum, String productName){
        System.out.println("AllArgsConsrtuctor를 이용하여 객체 생성하시오.");
        this.productNum = productNum;
        this.productName = productName;
    }

    void showInfo(){
        System.out.println("productNum : " + productNum);
        System.out.println("productName : " + productName);
    }
}
