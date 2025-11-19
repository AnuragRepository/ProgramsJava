package Previous.CoreJavaProgramming;

import java.util.Scanner;

public class Prime {

    static int enteredNumber;

    public void enterNumber()
    {
        System.out.print("Enter number = ");
        Scanner sc= new Scanner(System.in);
        enteredNumber = sc.nextInt();
        System.out.println("Entered number = "+enteredNumber);
    }
    public void verifyPrime(){

        if(enteredNumber == 0 || enteredNumber == 1){
            System.out.println(enteredNumber +" is not a prime number");
        }
        else {
            float mid= (float) enteredNumber/2;
            int divisorCount=0;
            for(int i=1;i<=mid;i++)
            {
                if(enteredNumber%i==0)
                {
                    divisorCount++;
                }
            }
            if(divisorCount==1)
            {
                System.out.println(enteredNumber +" is  a prime number");
            }
            else {
                System.out.println(enteredNumber +" is not a prime number");
            }
        }
    }
    public void verifyprimeinSeries(int input[]){
        float midNumber;
        int divisorSeriesCount;

        System.out.print("Array series are ");
        for(int k=0;k<input.length;k++)
        {
            System.out.print(input[k] +" ");
        }

        System.out.println();
        for(int i=0; i<input.length;i++)
        {
            divisorSeriesCount=0;
            midNumber = input[i]/2;
            if(input[i]==0|| input[i]==1)
            {
                System.out.println(input[i] +" is not a prime number");
            }
            else {
                for (int j=1;j<=midNumber;j++)
                {
                    if(input[i]%j==0)
                    {
                        divisorSeriesCount++;
                    }
                }
            }
            if(divisorSeriesCount==1)
            {
                System.out.println(input[i]+ " is a prime number");
            }
            else {
                System.out.println(input[i]+ " is not a prime number");
            }
        }

    }

    public static void main(String[] args)
    {
        int array [] = {99, 78, 56, 101, 109, 117};
        Prime obj = new Prime();
        obj.enterNumber();
        obj.verifyPrime();
        obj.verifyprimeinSeries(array);
    }

}
