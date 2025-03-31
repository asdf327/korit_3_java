package ch17_static.singleton;

import lombok.Getter;

public class Samsung {
    //정적 변수
    private static Samsung instance;
    //멤버 변수
    @Getter
    private String company;
    private int serialNumber;

    private Samsung(){
        company = getClass().getCanonicalName();
        serialNumber = 20250000;
    }

//    private Samsung(){
//        int counter = 1;
//        System.out.println(counter + "번 째 생성자 생성");
//        counter++;
//    }
//
    public static Samsung getInstance(){
        if (instance == null){
            instance = new Samsung();
        }
        return instance;
    }

    public String createSeiralNumber(String mode){
        return mode + "_" + ++serialNumber;
    }
}
