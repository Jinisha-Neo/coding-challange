/*
* Given a sequence of numbers between 2 and 9, print all possible combinations of words formed from the mobile keypad which has english alphabets associated with each key.
Input: [2, 3, 4]

Output:
ADG BDG CDG AEG BEG CEG AFG BFG CFG ADH BDH CDH AEH BEH CEH AFH BFH CFH ADI BDI CDI AEI BEI CEI AFI BFI CFI
* */
package cp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MobileKeypad {
    public static void main(String args[])
    {
        List<List<Character>> keypad = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList('A', 'B', 'C'),
                Arrays.asList('D', 'E', 'F'),
                Arrays.asList('G', 'H', 'I'),
                Arrays.asList('J', 'K', 'L'),
                Arrays.asList('M', 'N', 'O'),
                Arrays.asList('P', 'Q', 'R', 'S'),
                Arrays.asList('T', 'U', 'V'),
                Arrays.asList('W', 'X', 'Y', 'Z')
        );
        int[] keys = {2, 3, 4};
        HashSet<String> combinations = new HashSet<>();
        for (char ch : keypad.get(keys[0])) {
            System.out.println(ch);
            combinations.add(String.valueOf(ch));
        }

        for(int i = 1; i < keys.length;i++)
        {
            Set<String> prevList = new HashSet<>(combinations);
            combinations.clear();

            for (Character ch : keypad.get(keys[i])) {
                System.out.println(ch);
                for (String s : prevList) {
                    System.out.println(s+ch+"***");
                    combinations.add(s + ch);
                }
            }
        }

        System.out.println(combinations);

    }
}

