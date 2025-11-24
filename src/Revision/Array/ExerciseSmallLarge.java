package Revision.Array;

public class ExerciseSmallLarge {

   /* Find the largest element in column of smallest array element*/
 /*  Step 1 - Find smallest element in array
    Step 2 - Find the largest element in column of smallest array element*/

    public static void main(String[] args)
    {
        int[][] arrayInput = {{2,5,1},{8,0,4},{9,1,9}};

     /* 2 5 1
        8 0 4
        9 1 9    */

        int min = arrayInput[0][0];
        int col =0;
        for(int i = 0 ;i<arrayInput.length;i++)
        {
            for(int j = 0 ;j<arrayInput.length;j++)
            {
                if(min>arrayInput[i][j])
                {
                    min = arrayInput[i][j];
                    col = j;
                }
            }
        }
        System.out.println("Smallest element = "+min);
        System.out.println("Column of Smallest element  = "+col);

        int max = arrayInput[0][col];
        for(int i = 0; i< arrayInput.length;i++)
        {
            for(int j =col;j<=col;j++)
            {
                if(max<arrayInput[i][j])
                {
                    max= arrayInput[i][j];
                }
            }
        }
        System.out.println("Largest element = "+max);
    }



}
