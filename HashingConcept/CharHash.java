package HashingConcept;

import java.util.HashMap;
import java.util.Scanner;

public class CharHash {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = s.next();  // You can use s.nextLine() if you want to allow spaces

        // HashMap to store character frequencies
        HashMap<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Enter number of queries:");
        int q = s.nextInt();
        while (q-- > 0) {
            System.out.println("Enter character to query:");
            char queryChar = s.next().charAt(0);
            System.out.println("Frequency of '" + queryChar + "': " + hash.getOrDefault(queryChar, 0));
        }

        s.close();
    }
}
