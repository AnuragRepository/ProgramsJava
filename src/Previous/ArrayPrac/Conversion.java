package Previous.ArrayPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Conversion {

    public static void main(String[] args)
    {
        Integer originalarray[] = {45, 12, 45, 0, 5, 1, 77, 77, 45, 0, 5, 1, 1110, 777, 777};

        ArrayList<Integer>originalList = new ArrayList<Integer>();

        //Convert List from arrays via stream
        List<Integer> sortedList =  Arrays.stream(originalarray).distinct().sorted().collect(Collectors.toList());

        //Convert newList from oldlist via stream
        List<Integer> NewList = originalList.stream().sorted().collect(Collectors.toList());

        //Convert Array to List
        List<Integer> sortedList1 = Arrays.asList(originalarray);

        //Convert set to list
        Set<Integer> createdSet=Arrays.stream(originalarray).collect(Collectors.toSet());
        ArrayList<Integer> ListFromSet= new ArrayList<Integer>(createdSet);

        //Convert list to Array
        Object arrayFromList[] = originalList.toArray();

        Integer arrayFromListInteger [] =originalList.toArray(new Integer[originalList.size()]);

        String arrayFromListString [] =originalList.toArray(new String[originalList.size()]);
    }


}
