package ch07_loops;

import java.util.Locale;
import java.util.Scanner;

public class Loop06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean is = true;
        String an = "";

        while (is){
            int n = 0;
            int sum = 0;
            System.out.println("1부터 몇까지 압을 구하시오 >>> ");
            n = scanner.nextInt();

            for (int i = 1; i <= n; i++){
                sum += i;
            }

            System.out.println(sum);

            scanner.nextLine();

            System.out.println("반복? Y / N");
            an = scanner.nextLine().toLowerCase();

            if (an.equals("N")){
                is = false;
            }
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close();

    }
}
