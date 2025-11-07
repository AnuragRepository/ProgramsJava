package Previous.Collection;

import java.util.ArrayList;

public class countElementwithPrefix {

    public static void main(String[] args)
    {
        int count=0;

        ArrayList<String> al= new ArrayList<String>();

       // ArrayList al= new ArrayList<String>(); if used
        //if(al.get(i).toString().startsWith("a"); to be used inside for

        al.add("Anurag");
        al.add("ankita");
        al.add("Master");
        al.add("Aanamika");

        System.out.println("Total Elements = "+al.size());

        for(int i=0;i<al.size();i++)
        {
            if(al.get(i).startsWith("a")||al.get(i).startsWith("A"))
            {
                count++;
            }
        }
        System.out.println("Elements with prefix A or a are = "+count);

    }


}
