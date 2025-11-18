package Revision.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

    public static void main(String[] args)
    {
        Integer[] arrayInput = {25,8,19,5,0,5,8,19};
        ascendingOrder(arrayInput);
        descendingOrder(arrayInput);
    }

    private static void descendingOrder(Integer[] arrayInput) {

       System.out.print("\nSorted arrayElements in descending order are ");
       List<Integer> listFromArray = Arrays.asList(arrayInput);
       Collections.reverse(listFromArray);
       listFromArray.stream().forEach(s->System.out.print(s+" "));
    }

    private static void ascendingOrder(Integer[] arrayInput) {

       System.out.print("Sorted arrayElements in ascending order are ");
       List<Integer> listFromArray =  Arrays.asList(arrayInput);
       Collections.sort(listFromArray);
       listFromArray.stream().forEach(s->System.out.print(s+" "));

    }

}
