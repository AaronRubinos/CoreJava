import java.text.DecimalFormat;

public class Examp11 {
    public static void main(String[] args) {
        /* 11. Write a Java program to print the area and perimeter of a circle.
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586
        */

        DecimalFormat df1 = new DecimalFormat("##.##############");
        DecimalFormat df2 = new DecimalFormat("###.##############");

        double r = 7.5;
        double r2 = Math.pow(7.5, 2);
        double pi = 3.141592653589793238462643383279502884197;
        double p = 2*pi*r;
        double a = pi*r2;

        System.out.println("Perimeter is = " + df1.format(p));
        System.out.println("Area is = " + df2.format(a));

    }
}
