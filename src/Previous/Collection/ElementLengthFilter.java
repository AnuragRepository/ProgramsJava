package Previous.Collection;

import java.util.ArrayList;

public class ElementLengthFilter {
    public static void main(String[] args)
    {
        ArrayList<String> al= new ArrayList<String>();
        al. add("Anurag");
        al. add("Chetna");
        al. add("Mast");
        al. add("RE");
        al. add("POM");

        //Print all element
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("********************");

        //Print element whose length>4
        for(int i=0;i<al.size();i++)
        {
            if(al.get(i).length()>4)
            {
                System.out.println(al.get(i));
            }
        }

        System.out.println("********************");

        //Print only 1 element whose length>4
        for(int i=0;i<al.size();i++)
        {
            if(al.get(i).length()>4)
            {
                System.out.println(al.get(0));
                break;
            }
        }
    }

}
