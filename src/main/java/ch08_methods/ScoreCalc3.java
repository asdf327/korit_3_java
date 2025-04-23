package ch08_methods;

public class ScoreCalc3 {

    public static void printDiamond (int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");  // 공백 출력
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");  // 별 출력
            }
            System.out.println();  // 줄바꿈
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");  // 공백 출력
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");  // 별 출력
            }
            System.out.println();  // 줄바꿈
        }
    }
    public static void main(String[] args) {
        printDiamond(5);

    }
}
