import java.text.DecimalFormat;

public class Examp13 {
    public static void main(String[] args) {
        /*
        13. Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.5 Height = 8.5

        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20
        */ 

        DecimalFormat df = new DecimalFormat("##.##");

        double w = 5.6;
        double h = 8.5;

        double area = w * h;
        double per = 2*(w + h);
        
        System.out.println("The are of a rectangle is: " + df.format(area));
        System.out.println("The perimeter of a rectangle is: " + df.format(per));

    }  
}
