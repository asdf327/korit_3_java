package ch00_review;

import java.util.Scanner;

public class Review06 {
    //메서드 정의 영역
    public double addScore(double score1, double score2){
        return score1 + score2;
    }

    public double calculataAbg(double totalscore, double numOfSubs){
        double average = totalscore / numOfSubs;
        return average;
    }

//    double sum = 0;
//    double subs = 0;
//
//    public void setSum(){
//        this.sum = sum;
//    }
//
//    public void subs(){
//        this.sum = subs;
//    }



    public static void main(String[] args) {
        //호출 영역
        Review06 review06 = new Review06();
        Scanner scanner = new Scanner(System.in);
        double totalscore = 0;
        double subjects = 0;
        double average = 0;
//        System.out.println(review06.addScore(4.5,3.0));

//        review06.sum = 10;
//        review06.sum = 5;

//        double sum = review06.addScore(4.5,3.0);
//        int subs = 2;

        System.out.print("몇 과목 >> ");
        subjects = scanner.nextDouble();
        System.out.print("더한 수 >> ");

        for (int i =0; i < subjects; i++){
            System.out.println((i+1));
            totalscore += scanner.nextDouble();
        }
        average = review06.calculataAbg(totalscore, subjects);
        System.out.println(average);

//        System.out.println("평균은 " + review06.calculataAbg(sum, subs));

    }
}
