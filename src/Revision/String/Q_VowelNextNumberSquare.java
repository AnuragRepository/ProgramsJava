package Revision.String;

public class Q_VowelNextNumberSquare {

    public static void main(String[] args) {
  /*
     i/p --> he1   2llo9
    o/p --> hi1   4llu81
    vowel --> put next vowel...number..square it*/

        String input     = "he1   2llo9";
        String reqOutput = "hi1   4llu81";
        char[] arrayVowel = {'a', 'e', 'i', 'o', 'u'};

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == '1' || input.charAt(i) == '2' || input.charAt(i) == '9') {
                String value = String.valueOf(input.charAt(i));
                int intValue = Integer.parseInt(value);
                int squareNumber = intValue*intValue;
                output.append(squareNumber);

            } else
            {
                for (int j = 0; j < arrayVowel.length-1; j++) {
                    if (input.charAt(i) == arrayVowel[j]) {
                        StringBuilder sb = new StringBuilder(String.valueOf(arrayVowel[j + 1]));
                        output.append(sb);
                    }
                    else
                    {
                        output.append(input.charAt(i));
                    }
                }

            }
        }
        System.out.println(output);



    }
}

