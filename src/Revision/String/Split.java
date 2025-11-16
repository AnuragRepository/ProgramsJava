package Revision.String;

public class Split {

    public static void main(String[] args)
    {
       /* If there are multiple consecutive delimiters,
        Java treats them as multiple split points, which  produce empty strings "" in the output.
        Check in for loop spit output*/

        String s = "My1Name111Is11Anurag";
        String[] k = s.split("1");
        for(int i = 0; i<k.length;i++)
        {
            String r = k[i];
            System.out.println(r);
        }


    }

}
