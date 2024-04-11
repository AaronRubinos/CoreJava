import java.util.Scanner;
import java.text.DecimalFormat;

public class Examp12 {
    public static void main(String[] args) {
        /*
        12. Write a Java program that takes three 
        numbers as input to calculate and print the 
        average of the numbers.
        */
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###,###.##");

        System.out.println("Input first number: ");
        double n1 = sc.nextInt();

        System.out.println("Input second number: ");
        double n2 = sc.nextInt();

        System.out.println("Input third nnumber: ");
        double n3 = sc.nextInt();

        double sum = n1 + n2 + n3;
        double ave = sum / 3;

        System.out.println("The avaerage of the three numbers is: " + df.format(ave));
        sc.close();

    }
}
