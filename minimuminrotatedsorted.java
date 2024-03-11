package StriverDSA;

class Solution {
    public int findmin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}

/*Initialization: Initialize variables start and end to the start and end indices of the array, respectively.

Binary Search Loop:

While start is less than or equal to end, continue searching.
Calculate the middle index mid using start + (end - start) / 2.
Check Pivot Condition:

If the element at the middle index nums[mid] is greater than the element at the end index nums[end], it means the pivot (the smallest element) lies to the right of mid, so update start to mid + 1.
Otherwise, the pivot may lie to the left of mid or mid itself could be the pivot. So, update end to mid.
Return the Minimum Element:

After the loop ends, start will point to the minimum element in the rotated sorted array.
Return the Minimum Element:

Return nums[start], which is the minimum element.

Dry Run Example:
Let's dry run the code with an example array: [4, 5, 6, 7, 0, 1, 2].

Initial: start = 0, end = 6
First Iteration:
mid = 3, nums[mid] = 7, nums[end] = 2. Since 7 > 2, update start = mid + 1, so start = 4.
Second Iteration:
mid = 5, nums[mid] = 1, nums[end] = 2. Since 1 < 2, update end = mid, so end = 5.
Third Iteration:
mid = 4, nums[mid] = 0, nums[end] = 2. Since 0 < 2, update end = mid, so end = 4.
Loop ends, return nums[start], which is nums[4] = 0, the minimum element.
This way, the algorithm efficiently finds the minimum element in the rotated sorted array.
*/