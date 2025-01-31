import java.util.Arrays;

public class CombineArrays1 {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2) {
        // Create a new array to hold the combined elements
        int[] combined = new int[arr1.length + arr2.length];
        
        // Copy arr1 into combined array starting from index 0
        System.arraycopy(arr1, 0, combined, 0, arr1.length);
        
        // Copy arr2 into combined array starting after arr1's elements
        System.arraycopy(arr2, 0, combined, arr1.length, arr2.length);
        
        return combined;
    }

    public static void main(String[] args) {
        CombineArrays1 combiner = new CombineArrays1();
        
        // Two example arrays to combine
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        
        // Combine the arrays
        int[] result = combiner.combine(arr1, arr2);
        
        // Print the result using Arrays.toString()
        System.out.println("Combined Array: " + Arrays.toString(result));
    }
}