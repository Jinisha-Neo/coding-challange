/*
* Given an integer array, determine whether it can be divided into pairs such that the sum of elements in each pair is divisible by a given positive integer k.
For Example
Input:
arr[] = { 3, 1, 2, 6, 9, 4 }
k = 5

Output: Pairs can be formed

Explanation: Array can be divided into pairs {(3, 2), (1, 9), (4, 6)} where the sum of elements in each pair is divisible by 5.


Input:
arr[] = { 2, 9, 4, 1, 3, 5 }
k = 6

Output: Pairs can be formed

Explanation: Array can be divided into pairs {(2, 4), (9, 3), (1, 5)} where the sum of elements in each pair is divisible by 6.
* */

package coding_challange.src.cp;

import java.util.Scanner;

public class Pair {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
        int num = s.nextInt();
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if((arr[i]+arr[j]) % num == 0)
                {
                    System.out.println("( "+arr[i]+" , "+arr[j]+" )");
                }
            }
        }
    }
}
