import java.util.Arrays;

public class Test {
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        return count(nums, upper) - count(nums, lower - 1);
    }

    private static long count(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        long res = 0;

        while (left < right) {
            if (nums[left] + nums[right] <= target) {

                res += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,44,5};
        System.out.print(countFairPairs(arr,2,3));
    }
}

