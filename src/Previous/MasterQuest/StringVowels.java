package Previous.MasterQuest;

public class StringVowels {

    public static void main(String[] args)
    {
/*        Given a string s, reverse only all the vowels in the string and return it.

       The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

        Example 1:

        Input: s = "IceCreAm"

        Output: "AceCreIm"

        Explanation:

        The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

         Example 2:

        Input: s = "leetcode"

        Output: "leotcede"

        Constraints:

        1 <= s.length <= 3 * 105
        s consist of printable ASCII characters.*/

        /*Approach
            Find vowels in string
            store it in array and reverse the array
            Replace vowels of original string with revesed array*/

        String s = "IceCreAm";
        String output="";

        String svowel ="";

        System.out.println("Input = "+s);
        System.out.println("Expected Output = AceCreIm");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
               svowel = svowel +s.charAt(i);
            }
        }
        System.out.println("Vowels in "+s+" are "+svowel);

        String vowelReverse = new StringBuilder(svowel).reverse().toString();

        System.out.println("Reversed Vowels of "+s+" are "+vowelReverse);

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                for(int j=0;j<vowelReverse.length();j++)

                {
                    output = s.replace(s.charAt(i),vowelReverse.charAt(j));
                }


            }

        }
        System.out.println("Actual Output = "+output);


    }

}
