package Previous.StreamPrac2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllPrac2 {
    public static void main(String[] args)
    {
        //WAP to count element with prefix a or A
        int count =0;
        ArrayList<String> al = new ArrayList<String>();
        al.add("anurag");
        al.add("Reetika");
        al.add("Janu");
        al.add("Anurag");
        al.add("abhilasha raj");
        al.add("Hope");
        al.add("raja");
        al.add("aliaa");

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Aman");
        al2.add("harman");
        al2.add("congnizant");

        for(int i=0;i<al.size();i++)
        {
            if(al.get(i).startsWith("a"))
            {
                count++;

            }
        }
        System.out.println("Element with a = "+count);

       // Stream.of(al).filter(s->s.get(0).)
       long countViaStream = al.stream().filter(s->s.startsWith("a")).count();
       System.out.println("Element with a (countViaStream) = "+countViaStream);

       //WAP to print all the elements of array list using streams
        al.stream().forEach(s->System.out.print(s+" "));

        //WAP to print all the elements of array list having length>4 using streams
        System.out.println();
        al.stream().filter(s->s.length()>4).forEach(s->System.out.print(s+" "));

        //WAP to print 1 element of array list having length>4 using streams
        System.out.println();
        al.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.print(s));

        //WAP to convert all list elements to uppercase and print
        System.out.println();
        al.stream().map(s->s.toUpperCase()).forEach(s->System.out.print(s+" "));

        //WAP to print list elements which ends with "a" in uppercase
        System.out.println();
        al.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.print(s+" "));

        //WAP to print elements starting with a in uppercase and sorted order
        System.out.println();
        al.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.print(s+" "));

        //WAP to combine 2 list of elements
        System.out.println();
        Stream.concat(al.stream(),al2.stream()).forEach(s->System.out.print(s+" "));

        //WAP to verify specific element present in list or not
        System.out.println();
       boolean present = al.stream().anyMatch(s->s.contains("Reetika"));
       System.out.println("Reetika Presence = "+present);

     //WAP to print elements starting with a in uppercase, store in new list and fetch 1st element of new list
       String element = al.stream().filter(s->s.startsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList()).get(0);
       System.out.println("element = "+element);

       //WAP to print unique number in integer array and sort it
        Integer arr[] = {2,56,3,5,2,4,4,4,4,7,1,0,-2,-1};
      Arrays.asList(arr).stream().distinct().sorted().forEach(s->System.out.print(s+" "));

      //WAP to create a new list, sort it and fetch 3rd index element from array
        System.out.println();
        Integer arr1[] = {2,56,3,-2,-1};
       List<Integer> newList1 = Arrays.asList(arr1).stream().sorted().collect(Collectors.toList());
       System.out.println("3rd index element from array = "+newList1.get(2));


    }

}
