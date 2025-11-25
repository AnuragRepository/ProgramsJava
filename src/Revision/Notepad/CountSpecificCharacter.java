package Revision.Notepad;

    class CountSpecificCharacter{

        public static void main(String[] args)
        {
            String name = "anurag anurag";
            int count =0;
            for(int i =0; i<name.length();i++)
            {
                if(name.charAt(i)=='a')
                {
                    count++;
                }
            }
            System.out.println(count);
        }


    }
