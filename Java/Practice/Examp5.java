import java.util.*;

public class Examp5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        5. Write a Java program that takes two numbers as input and displays the product of two numbers.
        Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output :
        25 x 5 = 125
         */

        int num1, num2, result;

        System.out.print("Input first number: ");
        num1 = sc.nextInt();

        System.out.print("Input second number: ");
        num2 = sc.nextInt();

        sc.close();

        result = num1 * num2;

        System.out.println(result);

        
    }
}
