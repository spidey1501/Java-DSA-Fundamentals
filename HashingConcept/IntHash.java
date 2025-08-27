package HashingConcept;

import java.util.HashMap;
import java.util.Scanner;

public class IntHash {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, Integer> hash = new HashMap<>();
        System.out.println("Enter the size n: ");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Enter number of queries:");
        int q = s.nextInt();
        while (q-- > 0) {
            int num = s.nextInt();
            System.out.println("Frequency of " + num + ": " + hash.getOrDefault(num, 0));
        }

        s.close();
    }
}