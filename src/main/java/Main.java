import calculators.PolishInvertedCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);
        String expression;
        PolishInvertedCalculator calculator;
        calculator = new PolishInvertedCalculator();

        System.out.println("Ingrese expresion:");
        expression = buffer.nextLine();

        System.out.println(calculator.resolve(expression));
    }
}
