package ch00_review;

public class Review14 {
    public static void main(String[] args) {
        int[] numbers = {7, 14, 21, 28, 35};

        int max  = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < max ){
                max  = numbers[i];
            }

            if (numbers[i] > min){
                min = numbers[i];
            }
        }

        System.out.println(max );
        System.out.println(min);


    }
}
