package ch00_review;

public class Book {
    //필드 선언
    private String title;
    private String author;
    private double price;

    //getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.out.println("음수가 될 수 없습니다");
        }else {
            this.price = price;
            System.out.println("가격이 변경되었습니다: " + price);
        }
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.title = "이상";
        book.author = "날개";
        book.price = -500;

        System.out.println("제목 :" + book.getAuthor()+"\n작가 이름 : "+ book.getTitle() +"\n가격 : "+ book.getPrice());
    }
}
