package ch17_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    //필드 선언
    private String factoryName;
    // 메서드 정의
    public SamsungPhone prod(){
        System.out.println(factoryName + "에서 스마트폰 생상");

        String model = "갤럭시s26";  // SmartPhone의 필드에 대입되겠죠
        String serial = null;

        Samsung samsung = Samsung.getInstance();
        // Samsung 객체 생성 -> 싱글톤 적용했으니까 매번 동일한 객체가 대입됨.

        serial = samsung.createSeiralNumber(model);
        // 여기서 SmartPhone객체 생성 -> AllArgsConstructor로 만들기로 함
        SamsungPhone samsung1 = new SamsungPhone(samsung.getCompany(), model, serial);

        return samsung1;
    }
}
