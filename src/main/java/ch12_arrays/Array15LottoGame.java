package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

public class Array15LottoGame {
    public static void main(String[] args) {
        //객체 생성
        Random random = new Random();

        //빈 배열 선언
        int[] lotto = new int[6];
        //게임 횟수
        int round = 5;

        //게임 횟수 반복을 위한 반복문
        for (int i = 0; i < round; i++) {
            //배열에 난수를 대입하기 위한 난수
            for (int j = 0; j < lotto.length; j++) {
                lotto[j] = (int) (Math.random() * 45) + 1;
            }
//            Arrays.toString(lotto);
            System.out.println(Arrays.toString(lotto));
        }
    }
}
