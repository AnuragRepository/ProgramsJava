package Previous.StreamPrac;

import java.util.ArrayList;

public class ElementLengthFilter {

    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al. add("Anurag");
        al. add("Chetna");
        al. add("Mast");
        al. add("RE");
        al. add("POM");

        //Print all element
        al.stream().filter(s->s.length()>0).forEach(s->System.out.println(s));

        //Print element whose length>4
        al.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

        //Print only 1 element whose length>4
        al.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));



    }
}
