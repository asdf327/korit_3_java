package ch07_loops;
/*

 */

public class Loop05 {
    public static void main(String[] args) {
//        for (int i =1; i < 4; i++){
//            for (int j = 1; j < 4; j++){
//                System.out.println(i + "일 " + j + "교실");
//            }
//        }

//        for (int i = 1; i <= 9; i++){
//            for (int j = 1; j <= 9; j++){
//                System.out.println(i + " x " + j + " = " + (i*j));
//            }
//            System.out.println();
//        }

        //반복 100번
//        for (int i = 1; i <= 100; i++){
//            System.out.print(i + " ");
//            if (i % 10 == 0){
//                System.out.println();
//            }
//        }

        for (int i = 1; i <= 100; i+=10) {
            System.out.println(i + " " + (i+1)+i + " " + (i+2)+ i + " " + (i+3)+ " " + (i+4));
        }
    }
}
