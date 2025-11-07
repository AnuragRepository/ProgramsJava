package Revision.Array;

public class TwoDArray {

    public static void main(String[] args)
    {
        //Print specific element in 2D array

   /* 1 2 3
    4 5 6*/

        int arrayConventionalWay[][] = new int[2][3];
        arrayConventionalWay[0][0] = 1;
        arrayConventionalWay[0][1] = 2;
        arrayConventionalWay[0][2] = 3;
        arrayConventionalWay[1][0] = 4;
        arrayConventionalWay[1][1] = 5;
        arrayConventionalWay[1][2] = 6;

        System.out.println("Print 2nd row 1st element in array = "+arrayConventionalWay[1][0]);

        //Print all element in 2D array

        int arrayLiteralWay[][] = {{1,2,3},{4,5,6}};
        System.out.println("2D array Print : ");
        int column = 3;
        for(int i=0;i<arrayLiteralWay.length;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(arrayLiteralWay[i][j]+" ");
            }
            System.out.println("\n");
        }

    }


}
