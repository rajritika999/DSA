package Arrays;
// This code defines a class `2ArrayConcatination` with a method `concatenate` that takes two integer arrays as input and returns a new array that is the concatenation of the two input arrays. The `main` method demonstrates how to use the `concatenate` method by creating two sample arrays, concatenating them, and printing the result.
public class 2ArrayConcatination {
    public int[] concatenate(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    public static void main(String[] args) {
        ArrayConcatination solution = new ArrayConcatination();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = solution.concatenate(arr1, arr2);
        System.out.print("Concatenated Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}