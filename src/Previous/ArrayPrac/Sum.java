package Previous.ArrayPrac;

public class Sum {

    public static void main(String[] args)
    {

//        WAP to sum of elements of arrays
//        Wap to sum of odd and sum of even elements in array
//        WAP to find mean of array

        int originalArray [] = {9, 12, 13, 5, 2, 1};
        int sumAll=0,sumOdd=0,sumEven=0;
        for(int i=0;i<originalArray.length;i++)
        {
            sumAll= sumAll+ originalArray[i];
            if(originalArray[i]%2!=0)
            {
                sumOdd= sumOdd+ originalArray[i];
            }else
            {
                sumEven= sumEven+ originalArray[i];
            }
        }
        System.out.println("Sum of all elements of array = "+sumAll);

        System.out.println("Mean of all elements of array = "+sumAll/(originalArray.length));

        System.out.println("Sum of odd elements of array = "+sumOdd);

        System.out.println("Sum of even elements of array = "+sumEven);
    }

}
