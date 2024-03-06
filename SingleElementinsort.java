package StriverDSA;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid == 0 || nums[mid] != nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] != nums[mid + 1])) {
                return nums[mid];
            } else if (mid % 2 == 0 && nums[mid] == nums[mid + 1] || mid % 2 != 0 && nums[mid] == nums[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // If no single non-duplicate found, you might want to handle this case
    }
}
//mid % 2 == 0 && nums[mid] == nums[mid + 1] || mid % 2 != 0 && nums[mid] == nums[mid - 1]  This Condition is for

/*mid % 2 == 0: This part of the condition checks if the index mid is even. If mid is even, it means we are at an even-indexed element in the array.

nums[mid] == nums[mid + 1]: This part checks if the current element at index mid is equal to the next element at index mid + 1. It's checking if there's a duplicate pair of elements starting from the current index mid.

mid % 2 != 0: This part of the condition checks if the index mid is odd. If mid is odd, it means we are at an odd-indexed element in the array.

nums[mid] == nums[mid - 1]: This part checks if the current element at index mid is equal to the previous element at index mid - 1. It's checking if there's a duplicate pair of elements ending at the current index mid.

So, the overall condition is checking if:

If mid is even (mid % 2 == 0), and the current element is equal to the next element (nums[mid] == nums[mid + 1]), it implies that the duplicate pair starts at the current index mid.
OR if mid is odd (mid % 2 != 0), and the current element is equal to the previous element (nums[mid] == nums[mid - 1]), it implies that the duplicate pair ends at the current index mid. 



Logic:
We use binary search to find the single non-duplicate element in the sorted array nums.
At each step of the binary search:
If mid is the single element and not adjacent to any other duplicate elements, we return it.
Otherwise, if the current mid is even and the next element is the same as the current, or if the current mid is odd and the previous element is the same as the current, we know the non-duplicate element is on the right side. So, we update start to mid + 1.
Otherwise, we update end to mid - 1.
Dry Run:
Let's dry run the code with an example:

Consider nums = [1, 1, 2, 2, 3, 3, 4, 4, 5].

Initially, start = 0, end = 8.
First iteration: mid = 4, nums[mid] = 3.
mid % 2 == 0, and nums[mid] == nums[mid + 1]. So, we update start = mid + 1.
Second iteration: start = 5, end = 8.
Second iteration: mid = 6, nums[mid] = 4.
mid % 2 == 0, and nums[mid] == nums[mid + 1]. So, we update start = mid + 1.
Third iteration: start = 7, end = 8.
Third iteration: mid = 7, nums[mid] = 4.
mid % 2 == 0, but nums[mid] != nums[mid + 1]. So, we return nums[mid].
The single non-duplicate element is 5.

This code efficiently finds the single non-duplicate element using binary search in a sorted array.*/

