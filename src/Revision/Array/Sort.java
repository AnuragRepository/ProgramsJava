package Revision.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Sort {

    public static void main(String[] args)
    {
        Integer[] arrayInput = {25,8,19,5,0,5,8,-1,0,19};
        ascendingOrder(arrayInput);
        descendingOrder(arrayInput);
        viaTreeSetStore(arrayInput);
    }

    private static void viaTreeSetStore(Integer[] arrayInput) {

        System.out.print("\nviaTreeSetStore ");
        List<Integer> integerListFromArray = List.of(arrayInput);
        TreeSet<Integer> treeSet = new TreeSet<Integer>(integerListFromArray);
        treeSet.stream().forEach(s->System.out.print(s+" "));

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
