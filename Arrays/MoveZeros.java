package Arrays;
import java.util.*;
// This class contains a method to move all zeros in an array to the end while maintaining the order of non-zero elements

public class MoveZeros {
    // Moves all zeros to the end of the array, maintaining the order of non-zero elements

    /**
     * @param nums
     */
    public static void moveZeros(int[] nums) {

        int j = 0; // position where next non-zero element should go

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                // swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}