package ch08_methods;

import java.util.Scanner;

public class Mrthod03 {

    public static String get(int roes, int sel) {
        String resl = "";

        switch (sel) {
            case 1:
                for (int i = 0; i < roes + 1; i++) {
                    for (int j = 0; j < i; j++) {
                        resl += "*";
                    }
                    resl += "\n";
                }
                break;
            case 2:
                for (int i = 0; i < roes; i++) {
                    for (int j = 0; j < roes - (i + 1); j++) {
                        resl += " ";
                    }
                    for (int j = 0; j < i + 1; j++) {
                        resl += "*";
                    }
                    resl += "\n";
                }
                break;
            case 3:
                for (int i = 0; i < roes; i++){
                    for (int j = 0; j < roes - i; j++){
                        resl += "*";
                    }
                    resl += "\n";
                }
                break;
            case 4:
                for (int i = 0; i < roes; i++){
                    for (int j = 0; j <i; j++){
                        resl += " ";
                    }
                    for (int j =0; j < roes -i; j++){
                        resl += "*";
                    }
                    resl += "\n";
                }
                break;
            default:
                resl = "잘못 입력했습니다";
        }
        return  resl;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = 0;
        int ch = 0;
        String sta = "";

        System.out.print("별 갯수 입력");
        row = scanner.nextInt();

        System.out.println("1. 왼쪽 증가");
        System.out.println("2. 오른쪽 증가");
        System.out.println("3. 왼쪽 감소");
        System.out.println("4. 오른쪽 감소");
        System.out.print("선택 >>> ");
        ch = scanner.nextInt();

        sta = get(row, ch);
        System.out.println(sta);
    }
}
