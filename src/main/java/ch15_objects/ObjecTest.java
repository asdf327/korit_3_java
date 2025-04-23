package ch15_objects;

public class ObjecTest {
    //필드 선언
    private String name;
    private  String address;

    //기본 생성자, 매개변수 생성자

    public ObjecTest() {
        super();
    }

    public ObjecTest(String name, String address) {
        this.name = name;
        this.address = address;
    }


    //겟터, 셋터

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void displayInfo1(){
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }
}
