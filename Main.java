import java.util.*;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // create an object
        Calculator calc = new Calculator();

        // int sum = myCalculator.addition(5, 3); // call a method (calling the add
        // method)
        // System.out.println("Addition: " + calc.addition(5, 3));
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        // int subtractResult = myCalculator.subtraction(5, 3);
        // System.out.println("Subtraction: " + calc.subtraction(10, 4));
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // int multiplyResult = myCalculator.multiplication(5, 5);
        // System.out.println("Multiplication: " + calc.multiplication(6, 2));
        System.out.print("Choose operation ( +, -, *, /):");
        String operation = input.next();

        // int divideResult = myCalculator.division(8, 2);
        // System.out.println("Division: " + calc.division(8, 2));

        if (operation.equals("+")) {
            System.out.println("Result: " + calc.addition(num1, num2));
        } else if (operation.equals("-")) {
            System.out.println("Result: " + calc.subtraction(num1, num2));
        } else if (operation.equals("*")) {
            System.out.println("Result: " + calc.multiplication(num1, num2));
        } else if (operation.equals("/")) {
            System.out.println("Result: " + calc.division(num1, num2));
        } else {
            System.out.println("Invalid operation!");
        }

    }

}
