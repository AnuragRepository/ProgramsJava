package Previous.MasterQuest;

import java.util.*;

public class ArrayInputFreq {

    public static void main(String[] args)
    {
        /*Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
        Return the largest lucky integer in the array. If there is no lucky integer return -1.

        Example 1:
        Input: arr = [2,2,3,4]
        Output: 2
        Explanation: The only lucky number in the array is 2 because frequency[2] == 2.

        Example 2:
        Input: arr = [1,2,2,3,3,3]
        Output: 3
        Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.

        Example 3:
        Input: arr = [2,2,2,3,3]
        Output: -1
        Explanation: There are no lucky numbers in the array.

        Constraints:

        1 <= arr.length <= 500
        1 <= arr[i] <= 500*/

        /*Input: arr = [2,2,3,4], O/P - 2
        Input: arr = [1,2,2,3,3,3], O/P - 3
        Input: arr = [2,2,2,3,3] , O/P- -1*/

        /*Approach
        1. Find occurence of each array elements using hashMap;
        2. Find Lucky integers i.e for which keys (i.e element) equal to values (i.e frequencies) and store in set
        3. Print -1 if no luck integer or else Find largest Lucky number from list  */

        //int arr[] = {2,2,3,4};
        //int arr[] = {1,2,2,3,3,3} ;
        //int arr[] = {2,2,2,3,3};
        //int arr[] = {1,2,2,3,4,4};

        int arr[] = {15,6,18,17,5,16,18,2,16,9,19,19,20,15,11,1,17,8,18,14,19,20,12,8,16,17,19,17,5,20,17,12,6,18,1,1,16,16,13,1,15,12,16,19,20,20,10,10,19,8,4,16,10,15,20,20,11,13,17,16,16,1,1,2,9,9,7,18,10,7,18,12,7,20,17,14,13,12,19,16,17,1,13,12,20,15,5,8,7,14,20,2,17,18,4,13,12,1,19,14,3,14,2,15,15,4,13,7,8,15,9,8,10,20,9,16,15,9,10,16,18,3,18,15,14,7,8,20,20,11,6,17,7,19,19,1,4,7,14,18,8,10,11,3,3,6,17,4,1,1,20,16,7,5,6,10,1,19,8,20,19,14,11,1,9,15,7,19,14,10,13,3,3,1,14,18,12,5,19,4,2,14,15,11,17,2,5,8,12,14,16,16,6,20,2,13,2,2,9,8,1,7,14,3,11,2,20,7,6,20,1,2,19,10,3,5,1,9,19,10,1,7,2,11,16,11,2,1,3,12,2,10,16,6,8,9,8,19,13,8,6,20,6,6,18,9,4,14,3,14,12,16,4,3,3,17,2,17,7,18,13,17,2,12,20,6,17,1,13,12,10,8,13,2,13,5,14,10,6};

        //constraintCheck(arr);
        inputArray(arr);

    }

    public static void constraintCheck(int[] arr)
    {
      assert (arr.length>1 && arr.length<=500);
      {
          for(int i=0;i<arr.length;i++)
          {
              {
                  assert arr[i]>1;
                  assert arr[i]<=500;
              }
          }
      }
    }

    public static void inputArray(int[] arr)
    {
        int frquencyCounter = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++)
        {
            if(hm.get(arr[i])==null)
            {
                hm.put(arr[i],1);
            }
            else
            {
                frquencyCounter = hm.get(arr[i]);
                frquencyCounter++ ;
                hm.put(arr[i],frquencyCounter);
            }
        }
        System.out.println("By entrySet = "+hm.entrySet());
        Set<Integer> luckyIntegerSet = new LinkedHashSet<Integer>();
        Set<Integer> keys = hm.keySet();
        for(Integer Key:keys)
        {
            Integer value = hm.get(Key);
            System.out.println("ArrayElements of "+Key + " is having  Frequency = "+value);
            if(Key==value)
            {
                luckyIntegerSet.add(Key);
            }
        }
        Iterator<Integer> it = luckyIntegerSet.iterator();
        System.out.print("Lucky Integers are ");
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
       ArrayList<Integer> luckyIntegerList = new ArrayList<Integer>(luckyIntegerSet);
        if(luckyIntegerList.isEmpty())
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println("\nLargest Lucky Integer in given array is " +luckyIntegerList.get(luckyIntegerList.size()-1));
        }

    }



}
