package Previous.StreamPrac;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ConvertToUppercase {

    public static void main(String[] args)
    {
        //convert all list elements to uppercase and print
        Stream.of("anurag","rajesh","Rakesh","varun").map(s->s.toUpperCase()).forEach(s->System.out.print(s+" "));

        System.out.println();
        System.out.println("*****************************");

        //print list elements  which ends with "n" in uppercase
        ArrayList<String> al = new ArrayList<String>();
        al.add("raj");
        al.add("simran");
        al.add("paul");
        al.add("suraj");
        al.stream().filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

        System.out.println("*****************************");

        //print elements starting with R in uppercase and sorted order
        Stream.of("ron","ram","rehan","raaya","Anurag").filter(s->s.startsWith("r")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.print(s+" "));
    }
}
