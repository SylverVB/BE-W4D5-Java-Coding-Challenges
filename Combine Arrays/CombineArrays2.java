public class CombineArrays2 {
    public int[] combine(int[] arr1, int[] arr2) {
        /**
         * Combine two arrays into a single array and return it.
         *
         * @param arr1 an array of ints.
         * @param arr2 an array of ints.
         * @return an array containing the contents of arr1 followed by the contents of arr2.
         */
        // Create a new array that can hold both arrays
        int[] combined = new int[arr1.length + arr2.length];
        
        // Manually copy elements from arr1 to combined
        for (int i = 0; i < arr1.length; i++) {
            combined[i] = arr1[i];
        }
        
        // Manually copy elements from arr2 to combined starting after arr1
        for (int i = 0; i < arr2.length; i++) {
            combined[arr1.length + i] = arr2[i];
        }
        
        return combined;
    }

    public static void main(String[] args) {
        CombineArrays2 combiner = new CombineArrays2();
        
        // Two example arrays to combine
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        
        // Combine the arrays
        int[] result = combiner.combine(arr1, arr2);
        
        // Print the result
        System.out.print("Combined Array: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}