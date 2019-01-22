import java.util.Scanner;

public class CalculatorChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        double number1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double number2 = scanner.nextDouble();
        scanner.close();

        Calculator calculator = new Calculator();
        calculator.performOperation(number1, number2);
    }
}
