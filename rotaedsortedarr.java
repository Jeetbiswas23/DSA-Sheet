package StriverDSA;

import java.util.Arrays;

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) { // Left side is sorted
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Right side is sorted
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1; // Return -1 if the target is not found
    }
}
/*Initially, start = 0, end = 6 (length of nums array - 1).
In the first iteration of the while loop:
mid = 0 + (6 - 0) / 2 = 3.
Since nums[mid] (nums[3]) = 7 is not equal to target, we enter the else block.
Since nums[start] (nums[0]) <= nums[mid], the left side is sorted.
Since target (0) is greater than or equal to nums[start] (4) and less than nums[mid] (7), we update end to mid - 1 = 2.
In the second iteration:
start = 0, end = 2.
mid = 0 + (2 - 0) / 2 = 1.
Since nums[mid] (nums[1]) = 5 is not equal to target, we enter the else block.
Since nums[start] (nums[0]) <= nums[mid], the left side is sorted.
Since target (0) is greater than or equal to nums[start] (4) and less than nums[mid] (5), we update end to mid - 1 = 0.
In the third iteration:
start = 0, end = 0.
mid = 0 + (0 - 0) / 2 = 0.
Since nums[mid] (nums[0]) = 4 is not equal to target, we enter the else block.
Since nums[start] (nums[0]) <= nums[mid] (nums[0]), the left side is sorted.
Since target (0) is equal to nums[start] (4), we return start, which is 0.
So, the index of the target 0 in the nums array is 0. */