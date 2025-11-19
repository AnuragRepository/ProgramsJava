package Revision.Array;

public class LargestSmallestConventional {

    public static void main(String[] args)
    {
        //Bubble sort
        //Basically we are sorting the element in descending order
        // Con - in case of duplicate elements some discrepancy may comes while extracting element based on index
        int[] input = {100,20,10,55,90,90,80};
        int temp =0;
        for(int i =0; i<input.length;i++)
        {
            for(int j = i+1; j<input.length;j++)
            {
               if(input[i]<input[j])// just use > for ascending order
               {
                   temp = input[i];
                   input[i]=input[j];
                   input[j]= temp;
               }
            }
        }
        System.out.println("Largest Element = "+input[0]);
        System.out.println("Second Largest Element = "+input[1]);
        System.out.println("Third Largest Element = "+input[2]);
        System.out.println("Smallest Element = "+input[input.length-1]);


    }


}
