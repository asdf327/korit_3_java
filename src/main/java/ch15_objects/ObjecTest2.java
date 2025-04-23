package ch15_objects;

public class ObjecTest2 {
    private String name;
    private  String address;

    public ObjecTest2() {
        super();
    }

    public ObjecTest2(String name, String address) {
        this.name = name;
        this.address = address;
    }

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

    public String displayInfo2(){ //clss()3
        return "이름 : " + name + "주소 : " + address;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "주소 : " + address;
    }
}
