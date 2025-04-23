package ch08_methods;

import java.util.Scanner;

public class ScoreCalc2 {

//    public static double add(double tot, double adde){
//        return tot + adde;
//    }
//
//    public static double add(double tot, double adde, double score3){
//        return tot + adde + score3;
//    }
//
//    public static double add(double tot, double adde, double score3, double score4){
//        return tot + adde + score3+ score4;
//    }
//
//    public static double add(double tot, double adde, double score3, double score4, double score5){
//        return tot + adde + score3+score4+score5;
//    }
//
//    public static double add(double tot, double adde, double score3, double score4, double score5, double score6){
//        return tot + adde + score3+score4+score5+score6;
//    }

    //오버라이딩은 편하지만 항상 만능은 아니다. > 매개변수의 개수를 지정하기 때문에 유연성 x

    public static double add(double tot, double added){
        return tot + added;
    }

    public static double calcu(double tot, int num){
        return tot / num;
    }


    public static void main(String[] args) {
//        double sum = add(100,95);
//        System.out.println(sum);

//        System.out.println(add(4.5, 3.5));
//        System.out.println(add(4.5, 3.5)/2);

//        System.out.println(calcu(4.5, 3.5)/2);

//        double sum = add(4.5, 3.5);
//        int sub = 2;
//        double avg = calcu(sum, sub);

        Scanner scanner = new Scanner(System.in);
        //변수 목록
        boolean end = false;
        double sco = 0;
        double total = 0;
        int totalSub = 1; //과목 수, 반복할 때마다 ++
        double avg = 0; //total/totalSub의 결과값 대입

        //정수 입력 획구와 상관 없이 반복문 작성
        while (!end){
            System.out.println("정수를 입력하세요 (종료하려면 -1을 입력하세요) >>> ");
            sco = scanner.nextDouble();
            //score1 = -1이 대입되었다면 반복문이 종료되도록 작성
            if (sco == -1){ //왜 -1을 입력해야 종료되는가?
                break;
                //end = true; //현재 반복이 일어나고 다음 반복에 종료함으로 모든 연산이 이르어진다는 점에서 평균 계산 x
            }
            //합을 계산하는 코드
            total = add(total,sco );
            //평균을 계산
            avg = calcu(total, totalSub);
            System.out.println("정수를 압력시마다 합계와 평균");
            System.out.println("합계" +total);
            System.out.println("평균" + avg);

            totalSub++; //다음 반복 때마다 한 과목 더 늘어난 상태로 평균을 계산
        }

        System.out.println("정수를 압력시마다 합계와 평균");
        System.out.println("합계" +total);
        System.out.println("평균" + avg);

    }
}
