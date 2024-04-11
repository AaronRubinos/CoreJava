public class Examp15 {
    public static void main(String[] args) {
        int a = 20;
        int b = 27;

        System.out.println("a & b values before swapping: " + a + ", " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a & b values after swapping: " + a + ", " + b);
    }
}
