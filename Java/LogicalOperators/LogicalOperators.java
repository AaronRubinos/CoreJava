/**
 * LogicalOperators
 */
public class LogicalOperators {

    public static void main(String[] args) {
        //&& AND
        //|| OR
        //! NOT

        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x == y && a < b;
        System.out.println(!result);

    }
}