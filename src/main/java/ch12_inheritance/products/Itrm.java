package ch12_inheritance.products;

public class Itrm {
    private  String name;
    private  String category;

    //생성자
    public Itrm(String name, String category) {
        this.name = name;
        this.category = category;
    }

    //settet
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    //getter
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
