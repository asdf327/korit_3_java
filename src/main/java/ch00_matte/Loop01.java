package ch00_matte;

public class Loop01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum1 =0;
        int sum2 =0;

        for (int i =0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                sum1 += numbers[i];
            } else {
                sum2 += numbers[i];
            }
        }

        System.out.println(sum1);
        System.out.println(sum2);
    }
}
