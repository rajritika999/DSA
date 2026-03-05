package Arrays;
import java.util.Arrays;

// Write a class Solution with a method threeSum that takes an array of integers as input, and prints all unique triplets in the array that sum up to zero. The triplets should be printed in non-descending order, and the solution set must not contain duplicate triplets.

public class ThreeSum {
    public void threeSum(int[] nums) {
        // Sort the array to use two-pointer technique
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    System.out.println("Triplet: " + nums[i] + ", " + nums[left] + ", " + nums[right]);
                    // Skip duplicate elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();
        int[] nums = {-1, -2, 1, 2, -1, 0};
        solution.threeSum(nums);
    }
}       
