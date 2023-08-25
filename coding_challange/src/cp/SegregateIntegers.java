/*Given an array of positive and negative integers, segregate them in linear time and constant space. The output should print all negative numbers, followed by all positive numbers.
For example:
Input:  [9, -3, 5, -2, -8, -6, 1, 3]
Output: [-3, -2, -8, -6, 5, 9, 1, 3]
* */

package cp;

import java.util.Scanner;

public class SegregateIntegers {

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        int temp;
        int j = 0;
        for(int  i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }

        for(int  i = 0; i < n; i++)
        {
            if(arr[i] <  0)
            {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
               j++;
            }
        }
        for(int  i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
