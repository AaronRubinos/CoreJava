import java.util.*;

public class Examp6 {
    public static void main(String[] args) {
        /*
        6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
         */
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        int result;

        System.out.print("Input first number: ");
        num1 = sc.nextInt();

        System.out.print("Input second number: ");
        num2 = sc.nextInt();

        sc.close();

        result = num1 + num2;
        System.out.println(result);

        result = num1 - num2;
        System.out.println(result);

        result = num1 * num2;
        System.out.println(result);

        result = num1 / num2;
        System.out.println(result);

        result = num1 % num2;
        System.out.println(result);

    }
}
