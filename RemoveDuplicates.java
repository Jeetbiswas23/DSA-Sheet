package StriverDSA;


class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Initialize with 1 since the first element is always unique
        int i = 1; // Pointer to iterate through the array //2Pointers

        // Iterate through the array starting from the second element
        for (int j = 1; j < nums.length; j++) {
            // Check if the current element is different from the previous one
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j]; // Move the unique element to the next position
                uniqueCount++;
                i++;
            }
        }

        return uniqueCount;

    }
}
/*Suppose the input array is: nums = [1, 1, 2, 2, 3, 4, 4, 4, 5]

Initialization:

nums is not empty, so we proceed.
uniqueCount is initialized to 1 (since the first element is always considered unique).
i is initialized to 1 (as we start from the second element).
Iteration (j = 1):

j is 1, comparing nums[1] (1) with nums[0] (1). They are equal, so no action is taken.
Iteration (j = 2):

j is 2, comparing nums[2] (2) with nums[1] (1). They are different.
Set nums[i] (which is nums[1]) to nums[j] (which is nums[2]), effectively moving the unique element to the next position.
Increment both uniqueCount and i. uniqueCount becomes 2, and i becomes 2.
Iteration (j = 3):

j is 3, comparing nums[3] (2) with nums[2] (2). They are equal, so no action is taken.
Iteration (j = 4):

j is 4, comparing nums[4] (3) with nums[3] (2). They are different.
Set nums[i] (which is nums[2]) to nums[j] (which is nums[4]).
Increment both uniqueCount and i. uniqueCount becomes 3, and i becomes 3.
Iteration (j = 5):

j is 5, comparing nums[5] (4) with nums[4] (3). They are different.
Set nums[i] (which is nums[3]) to nums[j] (which is nums[5]).
Increment both uniqueCount and i. uniqueCount becomes 4, and i becomes 4.
Iteration (j = 6):

j is 6, comparing nums[6] (4) with nums[5] (4). They are equal, so no action is taken.
Iteration (j = 7):

j is 7, comparing nums[7] (4) with nums[6] (4). They are equal, so no action is taken.
Iteration (j = 8):

j is 8, comparing nums[8] (5) with nums[7] (4). They are different.
Set nums[i] (which is nums[4]) to nums[j] (which is nums[8]).
Increment both uniqueCount and i. uniqueCount becomes 5, and i becomes 5.
Result:

The modified array is [1, 2, 3, 4, 5, 4, 4, 4, 5], and uniqueCount is 5.
The first 5 elements are unique, and the function returns uniqueCount (5).
So, after the removal of duplicates, the array [1, 2, 3, 4, 5, 4, 4, 4, 5] has the first 5 elements as unique, and the function returns 5. */