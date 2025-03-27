package ch13_abstraction.adstract_class;

public class Main {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성을 할 수 없다
        Factory factory1 = new Factory("가전 제품 공장을 관리합니다. ") {
            @Override
            public void name() {
                System.out.println("가전 제품 공장을 관리합니다");
            }

            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 [ " + model + " ]을 생산합니다.");
            }
        }; //{};로 마무리되는데 메서드를 정의한게 아니라 객체 생성한거라서 그렇다

        factory1.displayInfo();
        factory1.produce("백색 가전 냉장고");
        //재사용하지 않고 한 번만 쓰고 치울 예정이라면(즉 이 Main클래스에서만 쓸거라면), 사용하기 좋습니다.

        System.out.println();

        //이제 그 추상 클래스의 객체 말고, 상속 받은 PhoneFactory의 객체 생성 하겠습니다.
        PhoneFactory factory2 = new PhoneFactory("애플 스마트폰 공장");

        factory2.produce("아이폰17");
        factory2.name();

        factory2.setName("생성 스마트폰 공징");
        factory2.displayInfo();

        System.out.println();

        TabletFactory tabletFactory = new TabletFactory(" 애플 태블릿 공장");

        tabletFactory.setName("구글 태블릿 공장");
        System.out.println("현재 공장은 " + tabletFactory.getName() +"으로 본경되었습니다. ");

        tabletFactory.produce("구글 테블릿");
        tabletFactory.name();

        tabletFactory.upgrade("구글 태블릿 10인치 2세대");
    }
}
