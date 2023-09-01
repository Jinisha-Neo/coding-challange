/*Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
* */
package cp;

import java.util.Scanner;

public class IPAddress {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        String addrs = s.nextLine();
        StringBuilder defangedAddrs = new StringBuilder();

        for(int i = 0; i < addrs.length(); i++)
        {
            if(addrs.charAt(i) == '.') {
                defangedAddrs.append("[.]");
            }
            else {
                defangedAddrs.append(addrs.charAt(i));
            }
        }
        System.out.println(defangedAddrs);

    }
}
