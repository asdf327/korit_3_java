package ch18_generic.wildcard;

public class Main {
    //ApimalDate의 필드가 Apimal 클래스의 서브 클래스에 해당하는지 확인하는 메서드
    public ApimalDate<? extends Apimal> getApimal(int flag){
        if (flag == 1){
            ApimalDate<Human> apimalDate = new ApimalDate<>(new Human());
            return apimalDate;
        } else if (flag == 2){
            ApimalDate<Tiger> apimalDate = new ApimalDate<>(new Tiger());
            return apimalDate;
        }
        return null; //Human도 Tiger도 아니면 null 리턴
    }

    public static void main(String[] args) {
        ApimalDate<Tiger> apimalDate1 = new ApimalDate<>(new Tiger());
        ApimalDate<Human> apimalDate2 = new ApimalDate<>(new Human());
        ApimalDate<Car> apimalDate3 = new ApimalDate<>(new Car());
        //현재 ApimalDate에 Car 객체가 들어갔지만 오류가 발생하지 않았다
        //T는 어떤 클래스든 들어갈 수 있다

        apimalDate1.printDate();
        apimalDate2.printDate();
//        apimalDate3.printDate();
        //apimalDate3의 printDate();에만 문제 발생
        //이상의 오류는 Car 객체를 강제로 Apimal 형태로 형변환하려고 했기 때문이다
        //이상이 제네릭을 적용했을 때의 문재다.

        System.out.println();

        //Main 클래스 객체 생성
        Main main = new Main();
        ApimalDate<? extends Apimal> apimalDate4 = main.getApimal(1);
        ApimalDate<? extends Apimal> apimalDate5 = main.getApimal(2);
        ApimalDate<? extends Apimal> apimalDate6 = main.getApimal(3);

        //이상의 코드의 결과 apimalDate4,5,6에는 알 수 없는 클래스의 객체가 필드로 들어갔다
        //그래서 조건문 작성이 필요함

        if (apimalDate4 != null){
            apimalDate4.printDate();
        }
        if (apimalDate5 != null){
            apimalDate5.printDate();
        }
        if (apimalDate6 != null){
            apimalDate6.printDate();
        } else {
            System.out.println("null");
        }
    }
}
