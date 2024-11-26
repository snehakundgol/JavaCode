public class Problemsolving {
    public static void main(String[] args) {
        
        // Sum of array
        int[] arr = {32, 11,34, 50,2};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array: " + sum); // Output: 43

        // Find the minimum value in arr1
        int[] arr1 = {2, 8, 9, 2, 30, 39, 24};
        int min = arr1[0]; // Correctly initialize with `arr1[0]`
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < min) { // Correct reference to `arr1`
                min = arr1[i];
            }
        }
        System.out.println("Minimum value in the array: " + min); // Output: 2

        // Check if arr2 is sorted
        int[] arr2 = {2, 5, 6, 22, 46, 2};
        boolean isSorted = true;
        for (int i = 0; i < arr2.length - 1; i++) 
        { 
            if (arr2[i] > arr2[i + 1]) {
                System.out.println("It is not a sorted array");
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted");
        }
    }
}
