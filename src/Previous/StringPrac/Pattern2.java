package StringPrac;

public class Pattern2 {

    public static void main(String[] args)
    {
        //o/p- 1*2**3****4********-

        String specialChar="*";
        for(int i=1;i<=4;i++)
        {
            System.out.print(i+specialChar);
            specialChar = specialChar.concat(specialChar);
        }

    }


}
