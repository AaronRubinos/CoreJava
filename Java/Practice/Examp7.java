import java.util.Scanner;

public class Examp7 {
    public static void main(String[] args) {
        /*
         * 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        Test Data:
        Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80
        */

        Scanner sc = new Scanner(System.in);

        int num1, result;

        System.out.print("Input a number: ");
        num1 = sc.nextInt();

        sc.close();

        result = num1 * 1;
        System.out.println(result);
        result = num1 * 2;
        System.out.println(result);
        result = num1 * 3;
        System.out.println(result);
        result = num1 * 4;
        System.out.println(result);
        result = num1 * 5;
        System.out.println(result);
        result = num1 * 6;
        System.out.println(result);
        result = num1 * 7;
        System.out.println(result);
        result = num1 * 8;
        System.out.println(result);
        result = num1 * 9;
        System.out.println(result);
        result = num1 * 10;
        System.out.println(result);


    }
}
