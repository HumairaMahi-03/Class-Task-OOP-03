package task01;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operation = sc.next().charAt(0);

         int result = 0;
        boolean validOperation = true;

        if (operation == '+') {
            result = a + b;
        } else if (operation == '-') {
            result = a - b;
        } else if (operation == '*') {
            result = a * b;
        } else if (operation == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                validOperation = false;
            }
        } else {
            System.out.println("Error: Invalid operation.");
            validOperation = false;
        }

        // Display the result if the operation is valid
        if (validOperation) {
            System.out.println("The result is: " + result);
        }


    }
}
