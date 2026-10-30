package Top75problem.Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        // Example input array
        int[] arr = {4, 5, 4, 5, 4, 6, 2, 4, 2};
        printElementFrequencies(arr);
    }
    public static void printElementFrequencies(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        // LinkedHashMap keeps the elements in their order of first appearance
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        // Populate the frequency map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Print frequencies
//        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
        System.out.println(frequencyMap);


    }
}
