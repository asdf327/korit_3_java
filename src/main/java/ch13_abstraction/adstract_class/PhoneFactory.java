package ch13_abstraction.adstract_class;

public class PhoneFactory extends Factory {

    // 생성자밑 메서드를 복사 및 타이핑을 할 필요 없다.
    public PhoneFactory(String name) {
        super(name);
    }

    @Override
    public void name() {
        System.out.println("스마트폰 공장을 관리합니다. ");
    }

    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 스마트폰을 생산합니다.");
    }
}
