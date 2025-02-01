public class IsSortedSolution2 {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is sorted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;  // If any pair of adjacent elements is out of order, return false
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsSortedSolution2 solution = new IsSortedSolution2();
        
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {7, 5, 9, 0, 2};
        
        System.out.println("Array 1 is sorted: " + solution.checkSort(arr1));  // Expected: true
        System.out.println("Array 2 is sorted: " + solution.checkSort(arr2));  // Expected: false
    }
}