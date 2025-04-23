package ch14_castimg.animals;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. 업캐스팅");
        Dog dog = new Dog();
        dog.make();
        dog.fetch();

        Animal animal1 = dog; //업캐스팅1
        animal1.make(); //개가 짖습니다 출력. 재정의 된 메서스가 출력
//        animal1.fetch //호출불가 부모 클래스는 자식 클래스의 메서스 사용 불가
        dog.fetch(); //dog를 animal1에 대입해도 dog가 사라지는 것이 아님

        Animal animal2 = new Dog(); //업캐스팅2 -> 시험에 자주 나옴
        animal2.make(); //마찬가지로 재정의된 메세스가 호출

        Animal animal3 = new Animal();
        animal2.make(); //동물이 소리를 냅니다.

        //instanceof 연산자 사용 예
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1); //true
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2); //true

        //:오브젝트가 인스턴스이거나 하위 클래스의 인스터스인 경우
        boolean result3 = dog instanceof Dog;
        System.out.println(result3);//true
        boolean result4 = dog instanceof Animal;
        System.out.println(result4);//true

        System.out.println("-------- animal3 검사 -------");

        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);//true
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6); //false

        System.out.println("2. 다운 케스팅");
        /*
              다운 캐스팅은 명시적으로 이루어짐
              (클래스명)객체명; -> (int)2.3과 같은 방식
              기본 자료형에서 벗어나 참조 자료형도 고려해야 함
         */

        Dog dog2 = (Dog) animal2; //다운 케스팅 방법
        dog2.make();
        dog.fetch(); //animal2는 Animal 클래스에 종속돼 있기 때문에 Dog의 고유 메서드 사용 불가(공통된 메서드는 제정의 버전)

//        Dog dog3 = (Dog) animal3; //빨간줄이 없음에도 오류
//        dog3.make(); //오류가 뜸. 다운캐스팅은 되는데 실행하고 출력하는 과정에서 오류
        /*
            animal3 생성할 때 Animal 클래스의 생성자를 호출해서 만들었기 때문에 다운 캐스팅 불가능
            이를 막기 위해서는
         */
        Animal animal4 = new Dog();
        //형태로 선언된 클래스와 호출한 생성자가 달라야 함
        // 이와 같은 오률를 막기 위해서 다운 캐스팅은 instanceof 연산자를 통한 조건식을 작성함

        if (animal4 instanceof Dog){ //참이면
            Dog dog4 = (Dog) animal4; //true라면 animal4는 Dog 클래스와 관련있음

            dog4.make(); //위의 조건식이 통과되면 다운캐스팅
            dog4.fetch();
        }

        System.out.println("2-2. 안전한 다운캐스팅");
        if (animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;

            dog3.make();
            dog3.fetch();
        } else {
            System.out.println("불가능한 다운 캐스팅");
        }
    }
}