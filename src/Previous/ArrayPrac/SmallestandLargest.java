package Previous.ArrayPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SmallestandLargest {

    public static void main(String[] args)
    {
        Integer originalArray[]= {45, 12, 45, 0, 5, 1, 77, 77, 45, 0, 5, 1, 1110, 777, 777};

       // Arrays.asList(originalArray).sort();

       List<Integer> sortedList= Arrays.stream(originalArray).distinct().sorted().collect(Collectors.toList());

       System.out.println("Smallest Number in =" +sortedList.get(0));

       System.out.println("Largest Number in = "+sortedList.get(sortedList.size()-1));

       Set<Integer> createdSet=Arrays.stream(originalArray).collect(Collectors.toSet());

       //Convert set to list
        ArrayList<Integer> sortedListFromSet= new ArrayList<Integer>(createdSet);

        System.out.println("Smallest Number in =" +sortedListFromSet.get(0));

        System.out.println("Largest Number in = "+sortedListFromSet.get(sortedListFromSet.size()-1));


    }

}
