import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        double a = scan.nextDouble();

        System.out.println("Please enter a 2nd number: ");

        double b = scan.nextDouble();

        System.out.println("Please enter an operator: (eg: +, -, /, *)");

        char operator = scan.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result of this operation is: "+(int)(a+b));
        } else if (operator == '-') {
            System.out.println("Result of this operation is: "+(int)(a-b));
        } else if (operator == '*') {
            System.out.println("Result of this operation is: "+(int)(a*b));
        } else if (operator == '/') {
            System.out.println("Result of this operation is: "+ (a/b));
        } else {
            System.out.println("Operator entered is invalid!");
        }







    }


}
