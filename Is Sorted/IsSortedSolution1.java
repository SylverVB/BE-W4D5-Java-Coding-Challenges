import java.util.Arrays;

public class IsSortedSolution1 {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is sorted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr) {
        // Create a copy of the array
        int[] sortedArr = arr.clone();
        
        // Sort the copied array
        Arrays.sort(sortedArr);
        
        // Compare the original array with the sorted copy
        return Arrays.equals(arr, sortedArr);
    }

    public static void main(String[] args) {
        IsSortedSolution1 solution = new IsSortedSolution1();
        
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {7, 5, 9, 0, 2};
        
        System.out.println("Array 1 is sorted: " + solution.checkSort(arr1));  // Expected: true
        System.out.println("Array 2 is sorted: " + solution.checkSort(arr2));  // Expected: false
    }
}