/*Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"

* */

package cp;

import java.util.Scanner;

public class StringReverse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        String reverseSentence = "";
        String revWord = "";

        String words[] = sentence.split(" ");

        for(String w:words){
            for(int i = w.length()-1; i >=0; i--)
            {
                revWord = revWord + w.charAt(i);
            }
            reverseSentence = reverseSentence + revWord+" ";
            revWord="";
        }
        System.out.println(reverseSentence);
    }
}
