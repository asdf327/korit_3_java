package ch09_classes;

import java.util.Scanner;

public class ScoreCalcMain {
    public static void main(String[] args) {
        //필요한 클래스들을 인포트
        Scanner scanner = new Scanner(System.in);
        ScoreCalc scoreCalc = new ScoreCalc();

        while (!scoreCalc.end){
            System.out.println("정수를 입력하세요 (종료하려면 -1을 입력하세요) >>> ");
            scoreCalc.sco = scanner.nextDouble();

            if (scoreCalc.sco == -1){
                break;
            }

            scoreCalc.total = scoreCalc.addScores(scoreCalc.total,scoreCalc.sco );

            scoreCalc.avg = scoreCalc.calcu(scoreCalc.total, scoreCalc.totalSub);
            System.out.println("정수를 압력시마다 합계와 평균");
            System.out.println("합계" +scoreCalc.total);
            System.out.println("평균" + scoreCalc.avg);

            scoreCalc.totalSub++;
        }
    }
}
