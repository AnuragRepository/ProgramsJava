package Revision.Notepad;

import java.util.Scanner;
class PrimeSpecific{

        public static void main(String[] args)
        {
            System.out.print("Enter number = ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int mid = a/2;
            int div =0;
            if(a ==0 || a==1)
            {
                System.out.println(a +" is not a prime number");
            }
            for(int i =2; i<=mid ;i++)
            {
                if(a%i==0)
                {
                    div++;
                }
            }
            System.out.println("divisorCountexcluding 1 = " +div);
            if(div>=1)
            {
                System.out.println(a +" is not a prime number");
            }
            else
            {
                System.out.println(a +" is a prime number");
            }
        }
    }

