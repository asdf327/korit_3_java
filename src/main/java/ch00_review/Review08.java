package ch00_review;
/*
    생성자 : 객체가 셍성될 때 호출되는 특별한 메서스
    특징 :
        1. 클래스명 = 생성자명
        2. 기본 생성자 / 매개변수 생성자
            a. 기본 생성자 : 정의되지 않아도 befult로 있지만, 생성자를 하나라도 정의되는 순간 기본 생성자도 적어야 한다
            b. 매개변수 생성자 : 객체를 생성할 때 필수적으로 요구되어야어지는 속성이 명시한 생성자
        3. 리턴이 없다,
        4. 형식 :
            a. 기본생성자
                클래스명() {}
            b. 매개변수 생성자
                클래스명(매개변수1, 매개변수2...){
                    this.매개변수1 = 매개변수1
                }
     생성 방법 :
        1. 타이핑
        2.
 */

import java.util.Scanner;

class Building {
    //필드 선언
    boolean eletator;
    boolean stair;
    int wall;
    int door;
    int window;
    String title;

    public Building() {
    }

    public Building(String title) {
        this.title = title;
    }

    public Building(boolean eletator, boolean stair, int wall, int door,
                    int window, String title) {
//        if (eletator){
//            this.eletator = true;
//            this.stair = true;
//        } else {
//            if (stair){
//                this.eletator = false;
//                this.stair = true;
//            } else {
//                this.eletator = false;
//                this.stair = false;
//            }
//        }
        this.eletator = eletator;
        this.stair = stair;
        this.wall = wall;
        this.door = door;
        this.window = window;
        this.title = title;
    }

    void showInfo(){
        System.out.println("\n이 건물은 " + title + "이고, 벽이 " + wall + "개, 문이 " + door + "개, 창문이 " + window + "개 있습니다.");
        System.out.println("엘리베이터 유무 : " + eletator);
        System.out.println("계단 유무 : " + stair);
    }
}


public class Review08 {

    public static void main(String[] args) {
        Building building1 = new Building(false, false, 5, 2, 6, "재팬아이티타운");
        Building building2 = new Building(true, true, 8,4,230,"코리아아이티타운");
        Building building3 = new Building(false, true, 3,1,0,"컴퓨터타운");

        building1.showInfo();
        building2.showInfo();
        building3.showInfo();
    }
}
