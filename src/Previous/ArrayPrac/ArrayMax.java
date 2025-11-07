package Previous.ArrayPrac;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayMax {

    public static  void main(String[] args)

    {
        Integer a [] = { 2, 5, 33, 0,0, 1 ,-2, 4,38,37,37,37,37,38,37};

        List<Integer> distinctLst = Stream.of(a).distinct().collect(Collectors.toList());
        System.out.print("Distinct elements are ");
        distinctLst.stream().forEach(s->System.out.print(s+" "));


        System.out.print("\nSorted elements are ");
        List<Integer> sortedList = distinctLst.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(s->System.out.print(s+" "));

        System.out.print("\nLargest element = "+sortedList.get(sortedList.size()-1));
        System.out.print("\nSecond Largest element = "+sortedList.get(sortedList.size()-2));
        System.out.print("\nSmallest element = "+sortedList.get(0));

    }



}
