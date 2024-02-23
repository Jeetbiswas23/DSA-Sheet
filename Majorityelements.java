package StriverDSA;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 1; // Reset count for each new element
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        return -1; // Return -1 if no majority element found
    }
}
/*Iterate through each element of the array using a for loop.
For each element, initialize a counter (count) to keep track of the frequency of occurrences of that element.
Use a nested for loop to compare the current element (nums[i]) with all subsequent elements (nums[j]) in the array.
If a match is found (nums[i] == nums[j]), increment the counter (count).
After comparing the current element with all subsequent elements, if the count exceeds half the length of the array (count > n / 2), it means that the current element is the majority element.
Return the majority element if found; otherwise, return -1 indicating that there's no majority element in the array.

nums = [3, 3, 4, 2, 4, 4, 2, 4, 4]
Initialization:

n = 9
Start the outer loop:
i = 0, nums[i] = 3
Outer Loop (i = 0, nums[i] = 3):

Initialize count = 1.
Start the inner loop from j = i + 1 = 1:
nums[j] = 3, increment count to 2.
Next iteration: nums[j] = 4.
Next iteration: nums[j] = 2.
Next iteration: nums[j] = 4, increment count to 3.
Next iteration: nums[j] = 4, increment count to 4.
Next iteration: nums[j] = 2.
Next iteration: nums[j] = 4, increment count to 5.
Next iteration: nums[j] = 4, increment count to 6.
After the inner loop, check if count > n / 2:
6 > 9 / 2 is true, so return nums[i] = 3.
Result: Majority element is 3.*/