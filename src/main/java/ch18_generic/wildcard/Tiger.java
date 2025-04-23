package ch18_generic.wildcard;

public class Tiger extends Apimal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 겁습니다");
    }

    public void hunt(){
        System.out.println("호랑이가 고기를 먹습니다");
    }
}
