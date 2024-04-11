import java.text.DecimalFormat;

public class Examp10 {
    public static void main(String[] args) {
        /* 10. Write a Java program to compute a specified formula.
        Specified Formula :
        4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        Expected Output
        2.9760461760461765
        */

        DecimalFormat df = new DecimalFormat("#.################");

        double n1 = 4.0;
        double n2 = 1 - (1.0/3);
        double n3 = (1.0/5);
        double n4 = (1.0/7);
        double n5 = (1.0/9);
        double n6 = (1.0/11);

        double result = n1 * (n2 + n3 - n4 + n5 - n6);
        System.out.println(df.format(result));
    }
}
