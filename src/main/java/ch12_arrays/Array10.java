package ch12_arrays;

public class Array10 {

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E", "f", "G", "H", "I", "J"};

        // 일반 for문
        for (int i = 0; i < names.length; i++){
            System.out.println((i+1) + "번 : " + names[i] + "님");
        }

        System.out.println();

        //향상된 for문
        int i = 0;
        for (String name : names){
            System.out.println((i+1) + "번 : " + name + "님");
            i++;
        }
    }
}
