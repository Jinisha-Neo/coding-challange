//{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}
/*Check if the sentence is pangram.
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
* */
package cp;

import java.util.*;

public class Pangram {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] modified = str.toLowerCase().toCharArray();

        Arrays.sort(modified);

        System.out.println(Arrays.toString(str.toLowerCase().toCharArray()));

        Set<Character> set = new HashSet<Character>();

        for(char c: modified)
        {
            set.add(Character.toLowerCase(c));
        }

        System.out.println(Arrays.asList(str.toLowerCase().toCharArray()).toString());
        Collections.addAll(set);
        System.out.println(set.size());
        System.out.println(set);

        if (set.size() == 26) {
            System.out.println("String is pangram");
        } else {
            System.out.println("String is not pangram");
        }

//        char alphabets[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//
//        System.out.println(Arrays.toString(modified));
//        System.out.println(Arrays.toString(alphabets));
//        if (Arrays.equals(modified, alphabets)) {
//            System.out.println("String is pangram");
//        } else {
//            System.out.println("Strings are not pangram");
//        }
    }
}
