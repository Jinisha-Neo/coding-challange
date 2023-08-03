
/*
* Given an array of distinct integers, shuffle it according to the given order of elements.
For example:
Input:
nums[] = { 1, 2, 3, 4, 5 }
pos[] = { 3, 2, 4, 1, 0 }

Output:

nums[] = { 5, 4, 2, 1, 3 }

i.e., if pos[i] = j, then update nums[j] = nums[i] for every index i.
In other words, update nums[pos[i]] = nums[i] for every index i.
* */

package cp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedElements {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < size; i++)
        {
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < arr.length; i++)
        {
            if (map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i]) +1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        for(Map.Entry m:map.entrySet()){
            int val = (int) m.getValue();
            for(int i = 0; i < val;i++)
                System.out.print(m.getKey()+" ");
        }
    }
}
