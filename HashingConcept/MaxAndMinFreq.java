package HashingConcept;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class MaxAndMinFreq {
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

        // Finding highest and lowest frequency element
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxElement = -1;
        int minElement = -1;

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue(); // frequency

            if (value > maxFreq) {
                maxFreq = value;
                maxElement = key;
            }

            if (value < minFreq) {
                minFreq = value;
                minElement = key;
            }
        }

        System.out.println("Element with Highest Frequency: " + maxElement + " -> " + maxFreq);
        System.out.println("Element with Lowest Frequency: " + minElement + " -> " + minFreq);

        // Optional: Query part
        System.out.println("Enter number of queries:");
        int q = s.nextInt();
        while (q-- > 0) {
            int num = s.nextInt();
            System.out.println("Frequency of " + num + ": " + hash.getOrDefault(num, 0));
        }

        s.close();
    }
}