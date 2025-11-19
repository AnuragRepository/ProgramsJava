package Revision.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseElementStoreArray {

    public static void main(String[] args)
    {
        Integer[] arrayInput = {10, 30, 5, 40, 1};
        //Integer[] arrayOutput = {1, 40, 5, 30, 10};

        List<Integer> list = Arrays.asList(arrayInput);
        Collections.reverse(list);
        //list print
        list.stream().forEach(s->System.out.print(s+" "));

        System.out.println("\nReversed Element Order in new Array = ");
        Object[] ArrayWithElementReverseOrder = list.toArray();
        for(Object element : ArrayWithElementReverseOrder)
        {
            System.out.print(element+" ");
        }



    }

}
