package ch17_static.singleton.products;

public class ProductView {
    //정적변수 선언 -> ProductView 클래스의 인스턴스 : 여기에 생성다 대입할 예정
    //싱글톤을 만들면 보통 정적 변수 이름이 인스턴스입니다.
    private static ProductView instance; // private 클래스에 ind를 정적 변수 필드에 넣음

    //private으로 생성자 선언 -> 싱글톤 패턴시 중요한 지점
    private ProductView(){
        int counter = 1; //일종의 객페 필드
        System.out.println(counter + "번 째 생성자 생성");
        counter++;
    }

    //static 메서드 정의 -> 대부분의 경우 getInstance()
    public static ProductView getInstance(){
        if (instance == null){ //현재 인스턴스가 없다면 실행
            instance = new ProductView(); //ProductView 객체 생성
        }                                  // 그 생성자를 정적 변수인 instance에 대입
        return instance; //위 조건이 실행되지 않느다면 instance != new이기에 이미 ProductView 객체가 생성되었다는 뜻
    }

    //정적 메서드 X
    public void showMainView(){
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView(){
        System.out.println("주문 정보를 보여주는 화면");
    }
}
