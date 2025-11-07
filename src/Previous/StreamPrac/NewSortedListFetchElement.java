package Previous.StreamPrac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewSortedListFetchElement {

    public static void main(String[] args)
    {
        ArrayList<Integer> originalList = new ArrayList<Integer>();
        originalList.add(7);
        originalList.add(9);
        originalList.add(1);
        originalList.add(5);
        originalList.add(4);

        //WAP to create a new list, sort it and fetch 3rd index element

       List<Integer> NewList = originalList.stream().sorted().collect(Collectors.toList());
       System.out.println("3rd element of new sorted List = " +NewList.get(2));








    }

}
