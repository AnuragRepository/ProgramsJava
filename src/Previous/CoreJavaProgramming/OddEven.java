package Previous.CoreJavaProgramming;
import java.util.Scanner;

public class OddEven {

    static int enteredNumber ;

    public void enterNumber()
    {
        System.out.print("Enter Number  = ");
        Scanner sc = new Scanner(System.in);
        enteredNumber = sc.nextInt();
        System.out.println("Entered Number = " +enteredNumber);
    }

    public static void oddevenCheck()
    {
        if (enteredNumber % 2 == 0) {
            System.out.print(enteredNumber + " is a even number");
        }
        else {
            System.out.print(enteredNumber + " is a odd number");
        }
    }
    public static void main( String[] args)
    {
        OddEven obj= new OddEven();
        obj.enterNumber();
        oddevenCheck();
    }

}
