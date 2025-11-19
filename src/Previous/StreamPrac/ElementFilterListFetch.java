package Previous.StreamPrac;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElementFilterListFetch {
    public static void main(String [] args)
    {
     //WAP to print elements starting with a in uppercase, store in new list and fetch 1st element of new list

   List<String> ls=  Stream.of("Anurag","role","forte").filter(s->s.endsWith("e")).map(s->s.toUpperCase()).collect(Collectors.toList());
   System.out.println("First element of new list ending with e in uppercase " +ls.get(0));

    }

}
