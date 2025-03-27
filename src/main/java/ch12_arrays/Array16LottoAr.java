package ch12_arrays;

import java.util.Arrays;

public class Array16LottoAr {
    public static void main(String[] args) {

        int[] lotto = new int[6];
        int round = 5;
        int temp = 0; //자주 쓰는 변수명
        boolean duplicate; //중복 되었을 때 true로 바꿔서 조건문 실핼

        for (int i = 0; i < round; i++) {
            for (int j = 0; j < lotto.length; j++) {
                duplicate = false; // true라면 아래 반복문이 한 번이라도 true라면 아래 반복문 모두 재생
                temp = (int) (Math.random() * 45) + 1;
                //temp에 들어간 난수가 이전 element와 값이 겹치는지 확인해야 함
                for (int k = 0; k < i; k++){ //중복을 체크하기 위해 만들어져 element가 대입된 부분까지만 탐색
                    if (lotto[k] == temp){
                        duplicate = true; //true라면 조건문 하나 더 필요
                    }
                }

                if (!duplicate){ //duplicate가 false라면 !duplicate가 true이므로 중복
                    lotto[i] = temp;
                } else {
                    //대입이 아니라 다시 뽑아야 함
                    i--;
                    //i = 3일때 실행되면 i = 2로 바뀌게 됨
                }
            }
            System.out.println(Arrays.toString(lotto));
        }
    }
}
