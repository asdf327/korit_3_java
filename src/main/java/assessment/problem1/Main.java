package assessment.problem1;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(10, 20);

        calculator.sub(200, 100);

        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.sub(200, 100));
    }
}
