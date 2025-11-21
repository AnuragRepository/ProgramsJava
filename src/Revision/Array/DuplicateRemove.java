package Revision.Array;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateRemove {

    public static void main(String[] args)
    {
       Integer[] arrayInput = {25,8,19,5,-2,-3,0,5,8,19,7,7,7,7,8,8,8,0,0,-2,-2};

       viaListStreamWay(arrayInput);

       viaSetStoreWay1(arrayInput);

        viaSetStoreWay2(arrayInput);

        viaConventionalWay(arrayInput);

    }

    private static void viaConventionalWay(Integer[] arrayInput) {

        ArrayList<Integer> elementList = new ArrayList<Integer>();
        for(int i = 0 ; i< arrayInput.length; i++)
        {
            if(!elementList.contains(arrayInput[i]))
            {
                elementList.add(arrayInput[i]);
            }
        }
       System.out.println("\nviaConventionalWay Unique array = "+elementList.toString());

    }

    private static void viaSetStoreWay2(Integer[] arrayInput) {

        System.out.print("\nviaSetStoreWay2: ");
        List<Integer> listFromArray = List.of(arrayInput);
        HashSet<Integer> hashSet = new HashSet<Integer>(listFromArray);
        hashSet.stream().forEach(s->System.out.print(s+" "));

    }

    private static void viaSetStoreWay1(Integer[] arrayInput) {

        System.out.print("\nviaSetStoreWay1: ");
        Set<Integer> uniqueSet = List.of(arrayInput).stream().collect(Collectors.toSet());
        uniqueSet.stream().forEach(s->System.out.print(s+" "));
    }

    private static void viaListStreamWay(Integer[] arrayInput) {

        System.out.print("\nviaListStreamWay: ");
        List<Integer> listFromArray =  List.of(arrayInput);

        List<Integer> UniqueList = listFromArray.stream().distinct().collect(Collectors.toList());

        UniqueList.stream().forEach(s->System.out.print(s+" "));
    }

}
