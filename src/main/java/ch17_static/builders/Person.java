package ch17_static.builders;

import lombok.ToString;

@ToString
public class Person {

    private String name;
    private int age;
    private String address;

    private Person(Builder builder){ // 대입이 아니라 builder 속성값을 그대로 Person 객체를 생성하겠다는 의미
        //private라서 builder 통해서만 객체 생성 가능
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    //객체를 생성하는 main 단계에서 일반 생성자가 아니라 Builder을 통해서 Person 객체를 생성할거라서 static 선언
    public static class Builder{
        private String name;
        private int age;
        private String address;

        //이하의 코드는 메서드에 해당
        //대부분 동사를 행위를 나타내기 때문에 동사로 작성하지만 빌더 페턴의 경우 대입할 필드의 이름과 동일한 메서드명응 지음
        //즉, Builder.name("안근수")와 같은 식으로 코드를 작성하면 Person 객체는 name에 "안근수"라는 속성값을 갖는다
        public Builder name(String name){
            this.name = name;
            return this;
        }

        // Builder.name("안근수").age(38);
        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }
        //이상의 코드가 필드 속성값을 집어넣는 메서드

        public Person build(){
            return new Person(this);
        }
    }

}
