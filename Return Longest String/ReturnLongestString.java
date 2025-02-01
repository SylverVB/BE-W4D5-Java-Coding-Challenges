public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        String longest = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > longest.length()) {
                longest = arr[i];
            } 
        }
        return longest;
    }

    public static void main(String[] args) {
        // Create an instance of ReturnLongestString
        ReturnLongestString finder = new ReturnLongestString();
        
        // Test the method with an array of strings
        String[] arr = {"apple", "banana", "cherry", "kiwi"};
        
        // Find the longest string
        String longestString = finder.longest(arr);

        // Print the longest string
        System.out.println("The longest string is: " + longestString);
    }
}