package Previous.CoreJavaProgramming;

public class PrintMethodValue {

    public static String getData()
    {
       return("Anurag");
    }

    public static void main(String[] args)
    {
        String s= getData();
        System.out.println("Method value = "+s);
    }

}
