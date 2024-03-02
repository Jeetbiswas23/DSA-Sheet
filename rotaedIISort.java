package StriverDSA;

class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                return true; // Return true if target is found
            }
            
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                 // If all three elements pointed to by start, mid, and end are equal
                 // We can't determine if left or right side of the array is sorted
                 // So, we increment start and decrement end to skip over duplicates
                start++;// Move start towards right to skip over duplicates
                end--;   // Move end towards left to skip over duplicates
            } else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        return false; // Return false if target is not found
    }
}

/*The given code implements the binary search algorithm to search for a target element in a rotated sorted array.

Here's the logic and dry run step by step:

Initialize start to 0 and end to nums.length - 1.
Enter the while loop as long as start is less than or equal to end.
Calculate the mid index as start + (end - start) / 2.
Check if the element at index mid is equal to the target. If yes, return true as the target is found.
If the elements at indices start, mid, and end are all equal, it means we can't determine whether the left or right side of the array is sorted. In such cases:
Increment start to skip over duplicates.
Decrement end to skip over duplicates.
If the left side of the array (nums[start] to nums[mid]) is sorted:
Check if the target falls within the sorted range.
Update end to mid - 1 if target is in the left sorted range.
Otherwise, update start to mid + 1.
If the right side of the array (nums[mid] to nums[end]) is sorted:
Check if the target falls within the sorted range.
Update start to mid + 1 if target is in the right sorted range.
Otherwise, update end to mid - 1.
Repeat steps 3-7 until start becomes greater than end.
If the target is not found after the while loop, return false.
This approach effectively handles the rotated sorted array and efficiently searches for the target element.

Consider the input array: nums = [4, 5, 6, 7, 0, 1, 2] and the target target = 0.

Initialize start = 0 and end = 6 (length of nums array - 1).
Enter the while loop as start (0) <= end (6).
First Iteration:

Calculate mid = 0 + (6 - 0) / 2 = 3.
Check nums[mid] (nums[3]) = 7 which is not equal to target.
Check if nums[start] (nums[0]) == nums[mid] (nums[3]) == nums[end] (nums[6]). It's not the case, so we skip the corresponding block.
Since nums[start] (nums[0]) <= nums[mid] (nums[3]), the left side is sorted.
Since target (0) is less than nums[mid] (7) but greater than or equal to nums[start] (4), we update end to mid - 1 = 2.
Second Iteration:

Calculate mid = 0 + (2 - 0) / 2 = 1.
Check nums[mid] (nums[1]) = 5 which is not equal to target.
Check if nums[start] (nums[0]) == nums[mid] (nums[1]) == nums[end] (nums[2]). It's not the case, so we skip the corresponding block.
Since nums[start] (nums[0]) <= nums[mid] (nums[1]), the left side is sorted.
Since target (0) is less than nums[mid] (5), we update end to mid - 1 = 0.
Third Iteration:

Calculate mid = 0 + (0 - 0) / 2 = 0.
Check nums[mid] (nums[0]) = 4 which is not equal to target.
Check if nums[start] (nums[0]) == nums[mid] (nums[0]) == nums[end] (nums[0]). It's the case, so we execute the corresponding block.
Increment start to 1 and decrement end to 0.
Fourth Iteration:

start (1) is not less than or equal to end (0), so we exit the loop.
Since the loop exits without finding the target, we return false.
*/