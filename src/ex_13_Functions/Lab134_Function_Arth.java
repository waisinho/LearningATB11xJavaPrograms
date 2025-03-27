package ex_13_Functions;

import java.util.Scanner;

/**
 * This class provides basic arithmetic operations.
 */
public class Lab134_Function_Arth {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->


        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Enter the int only, ");
            System.exit(0);
        }

        System.out.println("Enter the num2");
        int b = 0;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            System.out.println("Enter the int only, ");
            System.exit(0);
        }

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a, b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);


    }

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the difference of a and b
     */
    static int sub(int a, int b) {
        return a - b;
    }

    /**
     * Divides the first integer by the second.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a and b
     * @throws ArithmeticException if b is zero
     */
    static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    static int mul(int a, int b) {
        return a * b;
    }

    static int mod(int a, int b) {
        return a % b;
    }

}
