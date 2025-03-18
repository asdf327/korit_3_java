package ch07_loops;

public class Loop03 {
    public static void main(String[] args) {
//        int a = 1;
//
//        while (a < 101){
//            if (a % 10 == 1) {
//                System.out.println("\n");
//            }
//            System.out.print(a + "\t");
//            a++;
//        }

        int b = 1;
        while (b < 101){
            System.out.println(b + " " + (b +1) + " " + (b +2) + " "+ (b +3)
                    + " "+ (b +4) + " "+ (b +5) + " "+ (b +6) + " "+ (b +7) + " "
                    + (b +8) + " "+ (b +9) + " ");
            b += 10;
        }
    }
}
