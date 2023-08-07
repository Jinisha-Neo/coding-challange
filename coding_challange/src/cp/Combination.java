/*
* Given an integer array, find all distinct combinations of a given length k, where the repetition of elements is allowed.
For example,
Input:  {1, 2, 3}, k = 2
Output: {1, 1}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {3, 3}

Input:  {1, 2, 3, 4}, k = 2
Output: {1, 1}, {1, 2}, {1, 3}, {1, 4}, {2, 2}, {2, 3}, {2, 4}, {3, 3}, {3, 4}, {4, 4}

Input:  {1, 2, 1}, k = 2
Output: {1, 1}, {1, 2}, {2, 2}
* */

package coding_challange.src.cp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combination {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        List<ArrayList<Integer>> list= new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    ArrayList<Integer> subArr = new ArrayList<>();
                    subArr.add(arr[i]);
                    int count = k;
                    while (count > 1) {
                        subArr.add(arr[j]);
                        count--;
                    }
                    list.add(subArr);
                }
            }

            for (ArrayList<Integer> subarr : list) {
                for (Integer i : subarr) {
                    System.out.print(i + "  ");
                }
                System.out.println();
            }
        }


    }

