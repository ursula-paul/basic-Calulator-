public class Main {

    public static void main(String[] args) {
        // create an object
        Calculator myCalculator = new Calculator();

        int sum = myCalculator.addition(5, 3); // call a method (calling the add method)
        System.out.println(sum);

        int subtractResult = myCalculator.subtraction(5, 3);
        System.out.println(subtractResult);

        int multiplyResult = myCalculator.multiplication(5, 5);
        System.out.println(multiplyResult);

        int divideResult = myCalculator.division(8, 2);
        System.out.println(divideResult);

    }

}
