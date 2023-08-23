package cp;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        boolean status = true;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0;i < str1.length(); i++)
        {
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
            }
            else {
                map.put(str1.charAt(i),1);
            }
        }
        System.out.println(map);
        for(int i = 0;i < str2.length(); i++)
        {
            if(map.containsKey(str2.charAt(i))){
                map.put(str2.charAt(i),map.get(str2.charAt(i))-1);
            }
            else {
                map.put(str2.charAt(i),1);
            }
        }
        System.out.println(map);
        for(Character k: map.keySet())
        {
            if(map.get(k) != 0)
            {
                status = false;
            }
        }

        if(status)
        {
            System.out.println("two strings are anagram");
        }
        else {
            System.out.println("Two strings are not anagram");
        }
    }
}
