package ch17_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        //객체 생성
//        ProductView productView1 = new ProductView();
        //ProductView의 생성자를 private라 선언했기 때문에 오류
        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();
        ProductView productView5 = ProductView.getInstance();
        //이상의 코드는 복수의 객체를 만든 것 같지만 ProductView.getInstance(); 결과값은 동일한 인스턴스이기에 객체는 1개

        //1번 째 생성자 생성 -> static 변수로 선언했으면 4줄 출력이 되어야 하지만 생성자 호출이 한 번뿐이기에 한 번만 출력

        productView1.showMainView();
        productView2.showMainView();
    }
}
