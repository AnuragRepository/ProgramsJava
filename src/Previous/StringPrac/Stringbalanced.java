package StringPrac;

import java.util.Scanner;

public class Stringbalanced {

    public static void main(String[] args)
    {
       /* You are given a binary string s consisting only of zeroes and ones.
        A substring of s is considered balanced if all zeroes are before ones and the
         number of zeroes is equal to the number of ones inside the substring.
         Notice that the empty substring is considered a balanced substring.

        Return the length of the longest balanced substring of s.

        A substring is a contiguous sequence of characters within a string.

         Example 1:

        Input: s = "01000111"
        Output: 6
        Explanation: The longest balanced substring is "000111", which has length 6.
        Example 2:

        Input: s = "00111"
        Output: 4
        Explanation: The longest balanced substring is "0011", which has length 4.
        Example 3:

        Input: s = "111"
        Output: 0
        Explanation: There is no balanced substring except the empty substring, so the answer is 0.

        Constraints:

        1 <= s.length <= 50
        '0' <= s[i] <= '1'*/
        System.out.println("Enter String = ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int countZeroes = 0;
        int countOnes = 0;
        for(int i= 0 ; i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                countZeroes++;
            }
            else {
                countOnes++;
            }
        }
        System.out.println("count of zeroes = "+countZeroes);
        System.out.println("count of ones = "+countOnes);
        if(countZeroes==countOnes)
        {
            System.out.println(s+" is a balanced string");
        }
        else {
            System.out.println(s+" is not a balanced string");
        }

    }


}
