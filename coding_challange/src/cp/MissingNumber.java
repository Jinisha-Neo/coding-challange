/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.


* */
package cp;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i = 0;

        for(int j = 0; j < arr.length;j++)
        {
            arr[j] = s.nextInt();
        }


        Arrays.sort(arr);

        for(i = 0; i < arr.length; i++)
        {
            if(i != arr[i]) {
                System.out.println(i);
                break;
            }
        }
        if(i == arr.length)
        {
            System.out.println(i);
        }
    }
}
