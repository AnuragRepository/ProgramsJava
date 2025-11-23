package Revision.Array;

public class TwoDArraySmallestLargest {

    public static void main(String[] args)
    {
    /*  5   2    0
        9  102  101
        0   8   101 */

        int[][] twoDArrayInput = {{5,2,0},{9,102,101},{0,8,101}};

        //System.out.println(twoDArrayInput.length);// it counts row size

        getLargestSecondLargest(twoDArrayInput);
        getSmallestSecondSmallest(twoDArrayInput);
        getSmallestConventionalMethod(twoDArrayInput);
        getLargestConventionalMethod(twoDArrayInput);
    }

    private static void getLargestConventionalMethod(int[][] twoDArrayInput) {
        int largest = twoDArrayInput[0][0];
        for(int i = 0; i<twoDArrayInput.length;i++)
        {
            for(int j = 0; j<twoDArrayInput.length;j++)
            {
                if(largest<twoDArrayInput[i][j])
                {
                    largest =twoDArrayInput[i][j];
                }

            }

        }
        System.out.println("Largest element in array via conventional way = "+largest);

    }

    private static void getSmallestConventionalMethod(int[][] twoDArrayInput) {
        int smallest = twoDArrayInput[0][0];
        for(int i = 0; i<twoDArrayInput.length;i++)
        {
            for(int j = 0; j<twoDArrayInput.length;j++)
            {
                if(smallest>twoDArrayInput[i][j])
                {
                    smallest =twoDArrayInput[i][j];
                }

            }

        }
        System.out.println("Smallest element in array via conventional way = "+smallest);

    }

    private static void getSmallestSecondSmallest(int[][] twoDArrayInput) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i =0;i<twoDArrayInput.length;i++)
        {
            for(int j =0;j<twoDArrayInput.length;j++)
            {
                if(twoDArrayInput[i][j]<smallest)
                {
                    secondSmallest = smallest;
                    smallest = twoDArrayInput[i][j];
                }
                else if(twoDArrayInput[i][j]<secondSmallest && twoDArrayInput[i][j]!=smallest)
                {
                    secondSmallest = twoDArrayInput[i][j];
                }
            }
        }
        System.out.println("Smallest element in array = "+smallest);
        System.out.println("Second Smallest element in array = "+secondSmallest);


    }

    private static void getLargestSecondLargest(int[][] twoDArrayInput) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<twoDArrayInput.length;i++)
        {
            for(int j=0;j< twoDArrayInput.length;j++)
            {
                if(twoDArrayInput[i][j]>largest)
                {
                    secondLargest = largest;
                    largest = twoDArrayInput[i][j];
                }
                else if (twoDArrayInput[i][j]>secondLargest && twoDArrayInput[i][j]!=largest)
                {
                    secondLargest = twoDArrayInput[i][j];
                }
            }
        }
        System.out.println("Largest element in array = "+largest);
        System.out.println("Second Largest element in array = "+secondLargest);

    }
}
