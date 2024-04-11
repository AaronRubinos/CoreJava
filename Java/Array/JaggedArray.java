/**
 * Jagged3D
 */
public class JaggedArray {

    public static void main(String[] args) {
        int nums[][] = new int[3][]; 
        
        nums[0] = new int[3]; //jagged. Means the array has inconsistent size
        nums[1] = new int[4];
        nums[2] = new int[2];

        //add value to jagged array
        for(int i=0; i<nums[i].length; i++)   {
            for(int j=0; j<nums.length; j++)  {
                nums[i][j] = (int)(Math.random() * 10);
                
            }

        }

        //display array values
        for(int n[] : nums)   {
            for(int m: n)   {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}