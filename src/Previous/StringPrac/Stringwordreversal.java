package StringPrac;
public class Stringwordreversal {
    public static void main(String[] args)
    {
     String s= "Cat Rat Mat Sat";

     String array[]=s.split(" ");

     for(int i=array.length-1;i>=0;i--)
     {
         System.out.print(array[i].toString().concat(" "));
     }

    }




}
