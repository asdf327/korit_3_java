package ch12_arrays;

public class Array06 {

    //총합
    private int calcSum(int[] scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        return sum;
    }

    //평균
    private double calcAyg(int[] scores){
        double ayg = 0;

//        for (int i = 0; i < scores.length; i++){
//            sum += scores[i];
//        } //calcSum 중복

//        int sum = calcSum(scores); //총합 메소드 calcSum를 가져와서

        ayg = (double) calcSum(scores) / scores.length; // 평균 계산

        return ayg;
    }

    //등급 인원
    private void chuntGrade(int[] scores){
        int[] grade = {0,0,0,0,0};

        for (int i = 0; i < scores.length; i++){
            if (scores[i] > 89){
                grade[0]++;
            } else if (scores[i] > 79){
                grade[1]++;
            } else if (scores[i] > 69){
                grade[2]++;
            }else if (scores[i] > 59){
                grade[3]++;
            } else {
                grade[4]++;
            }
        }

        System.out.println("A 학생 수 : " + grade[0]);
        System.out.println("B 학생 수 : " + grade[1]);
        System.out.println("C 학생 수 : " + grade[2]);
        System.out.println("D 학생 수 : " + grade[3]);
        System.out.println("F 학생 수 : " + grade[4]);
    }

    public void ptintalInfo(int[] scores){
        System.out.println("총점 : " + calcSum(scores));
        System.out.println("평균 : " + calcAyg(scores));
        chuntGrade(scores);
    }

    public static void main(String[] args) {
        //클래스의 메서드를 호출하기 위한 객체 생성
        Array06 array06 = new Array06();

        int[] scores = {100,97,55,24,49,60,20,77,89};
//
//        int sum = array06.calcSum(scores); //합을 구하는 메서드 호출
//        double avg = array06.calcAyg(scores); // 평균을 구하는 메서드 호출
//
//        System.out.println("총합: " + sum);
//        System.out.println("평균 : " + avg);
//        array06.chuntGrade(scores); //인원수를 구하는 메서드 호출

        array06.ptintalInfo(scores);
    }
}
