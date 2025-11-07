package Previous.ArrayPrac;

import java.util.Arrays;
import java.util.List;

public class verifyElement {

    public static void main(String[] args)
    {
        String names [] = {"anurag", "janu","automation", "Java"};

       List<String> namesList= Arrays.asList(names);

       boolean flag= namesList.contains("janu");

       System.out.println("Whether "+names[1]+" present in array = "+flag);
    }


}
