package StringPrac;

public class Pattern1 {

    public static void main(String[] args)
    {
       // o/p- 1*2**3***4****

        String specialChar ="";

        for(int i=1;i<5;i++)
        {
            specialChar = specialChar.concat("*");
            System.out.print(i+specialChar);

        }
    }

}
