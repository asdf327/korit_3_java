package ch13_abstraction.interfaces2;

public class VolumeUpButton extends Button {

    @Override
    public void onPressed() {
        System.out.println("음량을 계속 올립니다.");
    }

    @Override
    public void onUp() {
        System.out.println("음량을 한 칸 올립니다.");
    }
}
