package ch12_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("나비");
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal("바둑이", 2);

        Tiger tiger = new Tiger();
        tiger.setAnimaNsme("푸바오");
        tiger.setAnimaAge(4);

        System.out.println(tiger.getAnimaNsme()+ tiger.getAnimaAge());

        tiger.move(); //super.move();일 경우 -> 움직임입니다 출력
        tiger.hunt();
        animal1.move();
//        animal1.hunt(); //부모 클래스가 자식 클래스의 메서드 사용 불가

        System.out.println();

        Human human = new Human();
        human.move();
        human.setAnimaNsme("김미진");
        human.setAnimaAge(28);
        System.out.println("안녕하세요, 제 이름은 " + human.getAnimaAge() + "세이고 나이는 " + human.getAnimaNsme() + "입니다");
        System.out.println("내년에는 " + (human.getAnimaAge() + 1) + "세가 됩니다.");
//        human.setRead("자바의 기초");
//        System.out.println(human.getAnimaAge() + "은 " + human.getRead() + "를 읽는 중입니다.");
        human.read("자바의 기초");
    }
}
