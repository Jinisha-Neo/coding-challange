package cp;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();

        char s1[]=str1.toCharArray();
        char s2[]=str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2))
        {
            System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Two string are not anagram");
        }


    }
}
