package ch00;

public class Solution {
    public int solution(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        Solution solution1 = new Solution();
        System.out.println(solution1.solution(3, 2));
        System.out.println(solution1.solution(10, 5));
    }


}
