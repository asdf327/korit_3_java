package ch08_methods;

import java.util.Scanner;

public class Mrthod02 {

    public static String get(int roes, int sel){ //roes와 resl는 다른 개념
        String resl = "";

        if (sel == 1){
            for (int i = 0; i < roes + 1; i++){
                //별 찍히는 부분
                for (int j = 0; j < i; j++){
                    resl += "*";
                }
                //계행 부분
                resl += "\n";
            }
        } else if (sel == 2){
            for (int i = 0; i < roes ; i++) {
                //공백 찍히는 부분
                for (int j = 0; j < roes - (i+1); j++) {
                    resl += " ";
                }
                //별 찍히는 부분
                for (int j = 0; j < i+1; j++){
                    resl += "*";
                }
                //계행 부분
                resl += "\n";
            }
        } else if (sel == 4){
            //전체 줄 수
            for (int i = 0; i < roes; i++){
                //공백이 늘어나는 부분
                for (int j = 0; j <i; j++){
                    resl += " ";
                }

                //별이 찍히는 부분
                for (int j =0; j < roes -i; j++){
                    resl += "*";
                }
                resl += "\n";
            }

        } else if (sel == 3) {
            for (int i = 0; i < roes; i++){
                for (int j = 0; j < roes - i; j++){
                    resl += "*";
                }
                resl += "\n";
            }
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
