package Revision.String;

import java.util.HashMap;

public class Q_VowelNextNumberSquare1 {

    public static void main(String[] args) {
  /*
     i/p --> he1   2llo9
    o/p --> hi1   4llu81
    vowel --> put next vowel...number..square it*/

        String input     = "he1   2llo9";
        String reqOutput = "hi1   4llu81";
        char[] arrayVowel = {'a', 'e', 'i', 'o', 'u'};

        HashMap<Character,Character> hm = new HashMap<Character,Character>();
        hm.put('a','e');
        hm.put('e','i');
        hm.put('i','o');
        hm.put('o','u');
        hm.put('u','a');


   /*     StringBuilder output = new StringBuilder();
        for(char c : input.toCharArray())
        {
            if(Character.isDigit(c))
            {
               int nu   mber = Character.getNumericValue(c);
                output.append(number*number);
            }
            else if
            {

            }
        }*/

    }
}

