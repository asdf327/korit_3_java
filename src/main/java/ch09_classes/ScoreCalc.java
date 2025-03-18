package ch09_classes;

public class ScoreCalc {

    boolean end = false;
    double sco = 0;
    double total = 0;
    int totalSub = 1;
    double avg = 0;

    public double addScores(double tot, double added){
        return tot + added;
    }

    public double calcu(double tot, int num){
        return tot / num;
    }

}
