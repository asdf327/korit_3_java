package ch12_inheritance.products;

public class ProductMaim {
    public static void main(String[] args) {
        Itrm itrm = new Itrm("일반 상품", "일반 카테고리");
        System.out.println("이 상품은 "+ itrm.getName() + "입니다");
        System.out.println("이 상품은 " + itrm.getCategory() + "입니다");

        System.out.println();

        Product product = new Product("전자제품", "가전 제품", 100000, 10);
        product.setCategory("백색 가전 제품");
        System.out.println("해당 상품은 " + product.getCategory() + "입니다");
        product.display();
    }
}
