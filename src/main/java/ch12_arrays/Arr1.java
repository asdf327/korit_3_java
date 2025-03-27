package ch12_arrays;

public class Arr1 {

    public static void main(String[] args) {
//        int[] arrs = {4,7,1,9,6,2,5,8,10,3};
//        int sum = 0;
//        for (int arr : arrs){
//            sum += arr;
//        }
//        System.out.println(sum);

        int[] numbers = {10, 4, 7, 23, 1, 50, 33};

        int num1 = numbers[0];
        int num2 = numbers[0];
        
        for (int number : numbers){
            num1 += number;
            num2 += number;
        }

        System.out.println(num2);
        System.out.println(num1);



    }
}
