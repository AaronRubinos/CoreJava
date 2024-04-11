public class ThreeDimeArray {
    public static void main(String[] args) {
        int nums[][][] = new int[3][4][5];

        //add value to array
        for(int i=0; i<3; i++)   {
            for(int j=0; j<4; j++)  {
                for(int k=0; k<5; k++) {
                    nums[i][j][k] = (int)(Math.random() * 10);
                }
                
            }

        }

        //display array values
        for(int b=0; b<3; b++)   {
            for(int n=0; n<4; n++)  {
                for(int m=0; m<5; m++)   {
                    System.out.print(nums[b][n][m] + " ");
                }
            }
            System.out.println();
        }
    }
}
