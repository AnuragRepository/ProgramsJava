package StringPrac;
public class Stringcharreversal {

    public static void main(String[] args)
    {
        String s = "Anurag is an engineer";
        String rev="";

        for(int i=s.length()-1;i>=0;i--)
        {
            rev= rev+s.charAt(i);
        }
        System.out.println("Reversed of " + s+" = "+rev);
    }

}
