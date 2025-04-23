package ch12_inheritance.book;

public class EBook extends Book {

    private double fileSize;
    private String format;

    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    public void displayInfo(){
        System.out.println("제목 : "+ getTitle());
        System.out.println("저자 : " + getAuthor());
        System.out.println("파일 크기 : " + fileSize);
        System.out.println("파일 형식 : " + format);
    }
}
