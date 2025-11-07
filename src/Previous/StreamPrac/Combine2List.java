package Previous.StreamPrac;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Combine2List {

    public static void main(String[] args)
    {
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("anu");
        al1.add("raj");
        al1.add("ron");
        al1.add("tony");

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Paul");
        al2.add("Saya");

        //WAP to combine 2 list of elements
       Stream<String> combined=Stream.concat(al1.stream(),al2.stream());
       combined.forEach(s->System.out.print(s+" "));

    }

}
