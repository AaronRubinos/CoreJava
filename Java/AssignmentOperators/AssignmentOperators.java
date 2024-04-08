/**
 * AssignmentOperators
 */
public class AssignmentOperators {

    public static void main(String[] args) {
     
        int num1 = 7;
        //int num2 = 5;

        //int result = num1 % num2;

        //num = num + 1;
        //num1 += 1;
        //num1++;     //post-increment
        //++num1;       //pre-increment
        //num1--;     //post-decrement
        //--num1;       //pre-decrement

        int result = num1++; //fetch the value first then increment
        //int result = ++num1; //increment first then fetch the value
        System.out.println(result);
    }
}