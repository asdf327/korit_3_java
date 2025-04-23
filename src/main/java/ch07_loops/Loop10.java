package ch07_loops;

public class Loop10 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j > 0; j++) {
                System.out.print("+");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++){
            //별찍기를 위한 2차 for
            for (int j = 0; j < 5 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j > 0; j++) {
                System.out.print("+");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++){
            //별찍기를 위한 2차 for
            for (int j = 0; j < 4 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
