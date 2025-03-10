import java.util.Arrays;

public class SecondLargestFinder {
    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        return secondLargest;
    }
    
    public static void main(String[] args) {
        int[] array = {10, 20, 4, 45, 99};
        System.out.println("Second Largest: " + findSecondLargest(array));
    }
}

