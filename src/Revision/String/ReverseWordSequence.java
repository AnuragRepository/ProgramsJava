package Revision.String;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWordSequence {

    public static void main(String[] args)
    {
        String s = "My Name Is Anurag";

        String[] arrayOfString = s.split(" ");

       for(int i= arrayOfString.length-1,j=0 ; i>=0 ; i--,j++)
       {
           String temp = arrayOfString[j];
           arrayOfString[j]=arrayOfString[i];
           arrayOfString[i]= temp;
       }
        System.out.print(Arrays.toString(arrayOfString));


    }


}
