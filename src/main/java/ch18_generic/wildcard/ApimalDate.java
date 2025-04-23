package ch18_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApimalDate<T> {
    private T apimal;

    public void printDate(){
        ((Apimal)apimal).move();
        //ApimalDate의 필드인 apimal를 Apimal 타입으로 형변환 -> .move(); 메서드 호출

        if (apimal.getClass() == Human.class){
            ((Human)apimal).read();
            //현재 필드인 apimal의 클래스를 조사하여 ((Human)apimal).read();을 통해 Human 클래스라면 고유 메소드 소환
        } else if (apimal.getClass() == Tiger.class){
            ((Tiger)apimal).hunt();
        }
    }
}
