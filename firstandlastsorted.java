package StriverDSA;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                int left = mid;
                int right = mid;
                // Expand the range to the left
                while (left > 0 && nums[left - 1] == target) {
                    left--;
                }
                // Expand the range to the right
                while (right < nums.length - 1 && nums[right + 1] == target) {
                    right++;
                }
                return new int[]{left, right};
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
/*First Iteration:

start = 0, end = 7
mid = (0 + 7) / 2 = 3
nums[mid] = 3, which is equal to the target.
left = 3, right = 3
We expand the range to the left until nums[left - 1] is not equal to the target. Here, it's already equal.
We expand the range to the right until nums[right + 1] is not equal to the target. We reach nums[5], which is not equal to the target.
So, we return [3, 5].
Function Ends

The final range where the target 3 is found in the array is [3, 5].

Let me know if you need further clarification on any step!
 */