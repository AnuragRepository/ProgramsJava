package Revision.Array;

public class LargestSmallestConventional {

    public static void main(String[] args)
    {
        int[] input = {100,20,10,55,90,90,80};

       conventionalWay1(input);
        conventionalWay2(input);

    }

    private static void conventionalWay2(int[] input) {

        int max = input[0];
        for(int i =0; i<input.length;i++)
        {
            if(max<input[i])
            {
                max= input[i];
            }
        }
        System.out.println("Maximum element via Conventional Way2 = "+max);

        int min = input[0];
        for(int i =0; i<input.length;i++)
        {
            if(min>input[i])
            {
                min= input[i];
            }
        }
        System.out.println("Minimum element via Conventional Way2 = "+min);

    }

    private static void conventionalWay1(int[] input) {

        //Bubble sort
        //Basically we are sorting the element in descending order
        // Con - in case of duplicate elements some discrepancy may comes while extracting element based on index


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
