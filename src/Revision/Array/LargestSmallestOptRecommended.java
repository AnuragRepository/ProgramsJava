package Revision.Array;

public class LargestSmallestOptRecommended {

    public static void main(String[] args)
    {
        int[] input1 = {100,20,10,55,90,90,80};
        int[] input2 = {-7,-2,100,20,10,55,90,0,90,-5,80};


        getlargestSecondLargestElement(input1);
        getSmallestSecondSmallestElement(input1);
        System.out.println("\n");
        getlargestSecondLargestElement(input2);
        getSmallestSecondSmallestElement(input2);

    }
    private static void getSmallestSecondSmallestElement(int[] input) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i <input.length;i++)
        {
            if(input[i]<smallest)
            {
                secondSmallest = smallest;
                smallest = input[i];
            }
            else if(input[i]<secondSmallest && input[i]!=smallest)
            {
                secondSmallest = input[i];
            }
        }
        System.out.println("Smallest = "+smallest);
        System.out.println("Second Smallest = "+secondSmallest);


    }

    private static void getlargestSecondLargestElement(int[] input) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i =0; i<input.length;i++)
        {
            if(input[i]>largest)
            {
                secondLargest = largest;
                largest = input[i];
            }
            else if (input[i]>secondLargest && input[i]!=largest)
            {
                secondLargest = input[i];
            }
        }
        System.out.println("Largest = "+largest);
        System.out.println("Second Largest = "+secondLargest);
    }


}
