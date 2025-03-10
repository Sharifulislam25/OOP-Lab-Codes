package Ques01;

public class Main {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        int mult1 = m.multiply(5, 6);
        double mult2 = m.multiply(5.25, 6.5);
        int mult3 = m.multiply(5, 6, 7);

        System.out.println(mult1);
        System.out.println(mult2);
        System.out.println(mult3);
    }
}
