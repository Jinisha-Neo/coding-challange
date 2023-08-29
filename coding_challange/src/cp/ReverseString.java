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

public class ReverseString {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        String reverse = "";

        String words[] = sentence.split(" ");

        for(String w:words){
            StringBuffer sbr = new StringBuffer(w);
            sbr.reverse();
            reverse = reverse+" " + sbr.toString();
        }
        System.out.println(reverse);

    }
}
