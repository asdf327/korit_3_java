package ch12_arrays;

public class Array05 {

    public static void main(String[] args) {
//        String[] scores = {"A", "B", "C", "D", "E", "F"};
//
//        for (int i = 0; i < scores.length; i++){
//            scores[i] += "+";
//            System.out.println("점수 : " + scores[i]);
//        }
//
//        int[] scores2 = {100,90,80,70,60,20,88,52,25,11};
//        int sum = 0;
//        double avg = 0;
//
//        for (int i = 0; i < scores2.length; i++){
//            sum += scores2[i];
//        }
//
//        avg = (double) sum / scores2.length;
//
//        System.out.println("총점 : " + sum);
//        System.out.println("평균 : " + avg);

        int[] scores3 = {88,94,77,100,64,32,95,82,59};

        int sum = 0;
        double avg = 0;

        for (int i = 0; i < scores3.length; i++){
            sum += scores3[i];
        }

        avg = (double) sum / scores3.length;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

        //풀이 1번
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        for (int i = 0; i < scores3.length; i++){
            if (scores3[i] > 89){
                a++;
            } else if (scores3[i] > 79){
                b++;
            } else if (scores3[i] > 69){
                c++;
            }else if (scores3[i] > 59){
                d++;
            } else {
                f++;
            }
        }
        System.out.println("A 학생 수 : " + a);
        System.out.println("B 학생 수 : " + b);
        System.out.println("C 학생 수 : " + c);
        System.out.println("D 학생 수 : " + d);
        System.out.println("F 학생 수 : " + f);
        System.out.println();

        //풀이 2번
        int[] grade4 = {0,0,0,0,0};

        for (int i = 0; i < scores3.length; i++){
            if (scores3[i] > 89){
                grade4[0]++;
            } else if (scores3[i] > 79){
                grade4[1]++;
            } else if (scores3[i] > 69){
                grade4[2]++;
            }else if (scores3[i] > 59){
                grade4[3]++;
            } else {
                grade4[4]++;
            }
        }

        System.out.println("A 학생 수 : " + grade4[0]);
        System.out.println("B 학생 수 : " + grade4[1]);
        System.out.println("C 학생 수 : " + grade4[2]);
        System.out.println("D 학생 수 : " + grade4[3]);
        System.out.println("F 학생 수 : " + grade4[4]);
    }
}
