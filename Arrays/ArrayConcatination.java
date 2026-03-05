package Arrays;
import java.util.*;
// Write a class ArrayConcatination with a method getConcatenation that takes an array of integers as input and returns a new array that is the concatenation of the input array with itself. For example, if the input array is [1, 2, 3], the output should be [1, 2, 3, 1, 2, 3].
public class ArrayConcatination {
    public int[] getConcatenation(int[] nums) {
        int l1 = nums.length;
        int l2 = nums.length * 2;
        int ans[] = new int[l2];
        
        for(int i = 0; i < l1; i++) {
            ans[i] = nums[i];
            ans[i + l1] = nums[i];
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        ArrayConcatination ac = new ArrayConcatination();
        int[] nums = {1, 2, 3};
        int[] result = ac.getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}
    

