package ch12_inheritance.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("자바의 정석", "남궁성");
        System.out.println("이 책의 제목은 "+ book.getTitle() +"입니다");
        System.out.println("이 책의 저자는 "+ book.getAuthor() + "입니다");

        System.out.println();

        EBook eBook = new EBook("스프링 입문", "이강준", 5.2, "EPUB");
        eBook.setFormat("PDF");
        System.out.println("이 전자책의 포맷은 " + eBook.getFormat() + "입니다");

        System.out.println();

        eBook.displayInfo();
    }
}
