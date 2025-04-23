package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5};
//        int i = 1;
//        System.out.println(i);
//        System.out.println(arr1);
//
//        String str = "안녕하세요";
//        System.out.println(str);
//
//        String str2 = new String("안녕하세요");
//        System.out.println(str2);
//
//        if (str == str2){
//            System.out.println("같다");
//        }
//        int[] arr2 = {9,8,7,6,5};
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);
//        System.out.println(arr2[3]);
//        System.out.println(arr2[4]);

//        for (int i =0; i < 5; i++){
//            System.out.print(arr2[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i =0; i < 5; i++){
//            System.out.print(arr2[i] + 1 + " ");
//        }
//
//        System.out.println();

//        for (int i =0; i < 5; i++){
////            arr2[i] = arr2[i] * 2;
//            arr2[i] *= 2;
//            System.out.print(arr2[i] + " ");
//        }

//        //배열의 방의 갯수를 정확히 모를 때 쓸 수 있는 방법
//        for (int i =0; i < arr2.length; i++){
////            arr2[i] = arr2[i] * 2;
//            arr2[i] *= 2;
//            System.out.print(arr2[i] + " ");
//        }

        //String 배열 선언 및 초기화
        String[] strArr1 = {"안", "녕","히","세","요"};

        for (int i =0; i < strArr1.length; i++){
            System.out.print(strArr1[i]);
        }

        System.out.println();

        for (int i =0; i < strArr1.length; i++){
            System.out.print(strArr1[i] + "/ ");
        }

        int[] arr3 = new int[10]; //비어있는 배열 선언
        arr3[0] = 0; //초기화
        arr3[1] = 0;  //만약 반복되는 규칙을 가지고 있다면 반복문 사용 가능

        System.out.println(arr3[0]);

    }
}
