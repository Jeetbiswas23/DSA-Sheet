package StriverDSA;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid inside the loop
            if (nums[mid] == target) {
                return mid; // Return index if target found
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        // If target not found, return the position where it should be inserted
        return start;
    }
}
/*Suppose we have the array nums = [1, 3, 5, 6] and the target value target = 5.

Initial State:
start = 0
end = 3
mid = (0 + 3) / 2 = 1
Iteration 1:
mid = 1
nums[mid] = 3
Since nums[mid] < target, we update start = mid + 1 = 2.
Iteration 2:
start = 2, end = 3
mid = (2 + 3) / 2 = 2
nums[mid] = 5
We found the target element at index 2, so we return mid = 2.
Final Result:
The target element 5 is found at index 2.
Now let's dry run another example where the target value is not present in the array.

Suppose we have the same array nums = [1, 3, 5, 6] but the target value is target = 2.

Initial State:
start = 0
end = 3
mid = (0 + 3) / 2 = 1
Iteration 1:
mid = 1
nums[mid] = 3
Since nums[mid] > target, we update end = mid - 1 = 0.
Iteration 2:
start = 0, end = 0
Now, start and end are equal, but the target value 2 is not found in the array.
Since the target value is not found, we return the position where it should be inserted, which is start = 0.
Final Result:
The target element 2 should be inserted at index 0. */