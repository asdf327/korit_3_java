package ch12_inheritance.products;

public class Product extends Itrm {
    private int price;
    private int stock;

    //부모 + 자식 생성자
    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }

    //자식 settet
    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //자식 getter
    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    //부모 getter
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    //부모 getter
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category);
    }

    //이상의 코드로 ProductMaim 할 수 있는 것
    //1. 객체 생성을 필드를 전부 초기화했을 때 할 수 있음
    //2. 부모 속성이든 자식 속성이든 상관 없이

    public void display(){
        System.out.println("제품명 : " + getName());
        System.out.println("카테고리 : " + getCategory()); //부모클래스지만 서로 다른 클래스이고 private
        System.out.println("카테고리 : " + price); //같은 클래스라 private라도 상관없음
        System.out.println("카테고리 : " + stock);
    }
}
