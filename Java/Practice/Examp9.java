/**
 * Examp9
 */
import java.text.DecimalFormat;

public class Examp9 {

    public static void main(String[] args) {
        /*
        9. Write a Java program to compute the specified expressions and print the output.
        Test Data:
        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        Expected Output
        2.138888888888889
         */

        DecimalFormat df = new DecimalFormat("#.###############");

        double num1 = 25.5, num2 = 3.5, num3 = 40.5, num4 = 4.5;
        double result;

        result = (num1 * num2 - num2 * num2) / (num3 - num4);
        System.out.println(df.format(result));

    }
}