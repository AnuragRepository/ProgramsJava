package Previous.StreamPrac;

public class BreakString {

    public static void main(String[] args)
    {
        String name = "My Name Is Anurag";

        String [] splittedName = name.split(" ");

        System.out.println("Broken String Values are : ");
        for(int i=0 ; i < splittedName.length;i++)
        {
            System.out.println(splittedName[i]+" ");
        }

    }

}
