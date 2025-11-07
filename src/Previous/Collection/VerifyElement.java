package Previous.Collection;

import java.util.ArrayList;

public class VerifyElement {
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("anurag");
        al.add("automation");
        al.add("JAVA");
        al.add("Force");

        for(int i=0; i<al.size();i++)
        {
            if(al.get(i).equalsIgnoreCase("FORCE"))
            {
                System.out.println(al.get(i)+" is present in list");
            }
        }
    }

}
