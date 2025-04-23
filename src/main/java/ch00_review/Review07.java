package ch00_review;
/*
     클래스 - 설계도 / 틀 / 청사진
     클래스 내부에는 속성(필드/멤버변수/인스턴스변수) / 행위(메서드(생성자, 겟터, 셋터) -> 필드 사용)
 */

class Developer {
    //필드 선언
    private String name;
    private boolean window;
    boolean java;
    private boolean python;
    int career;
    String company;

    Developer(){

    }

    void introduce(){
        String name = "안근수";
        boolean window = true;
        boolean java = true;
        boolean python = false;
        int career = 3;
        String company = "코리아IT아카데미";

        System.out.println("안녕하세요. 제 이름은 " + name + "입니다");
        System.out.println("현재 저는 " + company + "에서 일하고 있으며, " +career + "년 경력자입니다.");
        System.out.println("window Pc 소유 : " + window);
        System.out.println("java 역량 : " + java);
        System.out.println("python 역량 : " + python + "\n인 상황입니다. 감사합니다");

    }

    //생성자 정의 -> 원래 기본 생성자는 디폴트로 있습니다

    public Developer(String name, boolean window, boolean java, boolean python, int career, String company) {
        this.name = name;
        this.window = window;
        this.java = java;
        this.python = python;
        this.career = career;
        this.company = company;
    }

    public void setPython(boolean python){
        this.python = python;
    }

    public String getName(){
        return name;
    }

    public boolean isWindow(){
        return window;
    }

    public boolean isPython(){
        return python;
    }
}

public class Review07 {

    public static void main(String[] args) {
        //기본 생성자로 객체 바로 생성 가능
        Developer developer = new Developer("김미진", false, true,true,0,"코리아IT아카데미" );
        Developer developer1 = new Developer();

        developer.setPython(true);
        System.out.println("안녕하세요. 제 이름은 " + developer.getName() + "입니다");
        System.out.println("현재 저는 " + developer.company + "에서 다니고 있으며, " + developer.career + "년 경력자입니다.");
        System.out.println("window Pc 소유 : " + developer.isWindow());
        System.out.println("java 역량 : " + developer.java);
        System.out.println("python 역량 : " + developer.isPython() + "\n인 상황입니다. 감사합니다");
        System.out.println();
        developer1.introduce();
    }
}
