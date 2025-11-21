package Revision.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateFind {

    public static void main(String[] args) {
        Integer[] arrayInput = {25, 8, 19, 5, -2, -3, 0, 5, 8, 19, 7, 7, 7, 7, 8, 8, 8, 0, 0, -2, -2};
        //Integer[] arrayInput = {5, 5, 5, 5, 4, 4, 3, 4};

        viaWay_HashMap(arrayInput);
        viaWay_Conventional(arrayInput);

    }

    private static void viaWay_Conventional(Integer[] input) {
        ArrayList<Integer> listElements = new ArrayList<Integer>();
        System.out.println("\nDuplicate elements are : ");
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    if (!(listElements.contains(input[i]))) {
                        listElements.add(input[i]);
                        System.out.print(input[i] + " ");
                    }
                }
            }
        }
        System.out.println("\nAlso same present in List i.e : ");
        listElements.stream().forEach(s->System.out.print(s+" "));
    }


    private static void viaWay_HashMap (Integer[] arrayInput){

            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            int count = 0;
            for (int i = 0; i < arrayInput.length; i++) {
                if (hm.get(arrayInput[i]) == null) {
                    hm.put(arrayInput[i], 1);
                } else {
                    count = hm.get(arrayInput[i]);
                    count++;
                    hm.put(arrayInput[i], count);
                }
            }
            System.out.println(hm.entrySet());
            System.out.println("Duplicate elements are : ");
            Set<Map.Entry<Integer, Integer>> entrySet = hm.entrySet();

            for (Map.Entry<Integer, Integer> hm1 : entrySet) {
                if (hm1.getValue() > 1) {
                    System.out.print(hm1.getKey() + " ");
                }
            }
        }


}


