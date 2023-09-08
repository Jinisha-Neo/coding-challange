/*Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

Example 1:

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
Example 2:

Input:
N = 5, X = 10
Arr[] = {1, 2, 4, 3, 6}
Output: Yes
Explanation: Arr[2] + Arr[4] = 4 + 6 = 10
* */
package cp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SumExist {

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int arr[] = new int[n];

        for(int j = 0; j < arr.length;j++)
        {
            arr[j] = s.nextInt();
        }

        Arrays.sort(arr);
        int left = 0;
        int right = n-1;

        while(left < right)
        {
            if(arr[left] + arr[right] == x)
               System.out.println("yes");
            else if(arr[left] + arr[right] < x)
                left++;
            else
                right--;
        }


    }
}
