package Previous.ArrayPrac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class secondLargest {

    public static void main(String[] args)
    {
        Integer originalArray [] = {45, 12, 45, 0, 5, 1, 77, 77, 45, 0, 5, 1, 1110, 777, 777};

       List<Integer> sortedList=Arrays.stream(originalArray).distinct().sorted().collect(Collectors.toList());

       System.out.print("SortedList = ");
       for( int i=0;i<sortedList.size();i++)
       {
           System.out.print(sortedList.get(i)+" ");
       }
       System.out.println();
       System.out.println("Sorted List Size = "+sortedList.size());


       System.out.println("2nd Largest element = "+sortedList.get(sortedList.size()-2));
    }



}
