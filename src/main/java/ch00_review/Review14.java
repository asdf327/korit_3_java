package ch00_review;

public class Review14 {
    public static void main(String[] args) {
        // 배열 초기화
        int[] numbers = {3, 7, 2, 9, 4};

        // 최대값과 최소값을 저장할 변수 초기화
        int max = numbers[0];
        int min = numbers[0];

        // 배열의 각 원소를 순회하며 최대값과 최소값을 찾음
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];  // 새로운 최대값 발견
            }
            if (numbers[i] < min) {
                min = numbers[i];  // 새로운 최소값 발견
            }
        }

        // 최대값과 최소값 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
