package ch13_abstraction.adstract_class;

public class TabletFactory extends Factory {

    public TabletFactory(String name) {
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

    public void upgrade(String model){
        System.out.println(model + "로 업그레이드 합니다.");
    }
}
