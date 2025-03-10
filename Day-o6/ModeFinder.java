import java.util.HashMap;

public class ModeFinder {
    public static int findMode(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each number
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int mode = array[0];
        int maxCount = 0;
        
        // Find the number with the highest frequency
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > maxCount) {
                maxCount = frequencyMap.get(key);
                mode = key;
            }
        }
        
        return mode;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4};
        System.out.println("Mode: " + findMode(array));
    }
}
