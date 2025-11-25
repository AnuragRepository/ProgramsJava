package Revision.Notepad;

import java.util.ArrayList;
    class Distinct{

        public static void main(String[] args)
        {
            int [] arrayInput = {55,77,22,55,99,99,99,1,0,8,8,77};
            ArrayList<Integer> al = new ArrayList<Integer>();
            for(int i =0; i<arrayInput.length;i++)
            {
                if(!al.contains(arrayInput[i]))
                {
                    al.add(arrayInput[i]);
                    System.out.print(arrayInput[i]+" ");
                }
            }
            System.out.println("\nUnique List = ");
            al.stream().forEach(s->System.out.print(s+" "));
        }
    }
