package ch12_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Array12 {
    public static void main(String[] args) {
        // Math 클래스를 사용한 임의 실수 대입
//        double a = Math.random(); //0.0 초과 1.0미만의 난수 생성
//        System.out.println(a);

        System.out.println("\n1. Math.random()을 활용하여 베열에 값을 넣을겁니다.");
        Integer[] numbers = new Integer[10];
//        System.out.println((int) (Math.random() * 10) + 1);

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n2. 10씩 곱해서 한 줄에 출력");
        for (int number : numbers){
            System.out.print(number * 10 + " ");
        }

        System.out.println("\n\n3. 배열의 합의 크기");
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        System.out.println(sum);

        System.out.println("\n4. 짝수만 출력해서 합");
        int sum2 = 0;
        for (int number : numbers){
            if (number % 2 ==0){
                sum2 += number;
            }
        }
        System.out.println("짝수 합 : " + sum2);

        System.out.println("\n5. 오름 차순");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n6. 내림 차순");
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));


    }
}
