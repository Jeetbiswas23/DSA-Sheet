package StriverDSA;

import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        int longestStreak = 1;
        int currentStreak = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Only consider distinct elements
                if (nums[i] == nums[i - 1] + 1) {
                    currentStreak++;
                } else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }
        
        return Math.max(longestStreak, currentStreak);
    }
}
/*Null or Empty Check: The code begins with a check to see if the input array nums is null or empty. If it is, then it returns 0 as there are no elements to process.

Sorting the Array: The array nums is sorted using Arrays.sort(nums). Sorting the array is a pre-processing step that helps identify consecutive elements efficiently.

Tracking Streaks: Two variables longestStreak and currentStreak are initialized to 1. These variables keep track of the length of the longest consecutive sequence found so far and the length of the current consecutive sequence being processed, respectively.

Iterating Through the Array: The code iterates through the sorted array nums starting from index 1. The loop compares each element with its previous element to determine if it's part of a consecutive sequence.

Handling Distinct Elements: Inside the loop, the code checks if the current element nums[i] is not equal to the previous element nums[i - 1]. This check ensures that only distinct elements are considered.

Updating Current Streak: If the current element is consecutive to the previous one, the currentStreak is incremented by 1.

Updating Longest Streak: If the current element is not consecutive, the code compares currentStreak with longestStreak and updates longestStreak with the maximum of the two. Additionally, it resets currentStreak to 1 to start counting the streak again.

Returning the Result: Finally, the code returns the maximum of longestStreak and currentStreak. This ensures that if the longest streak ends at the last element of the array, it's still considered in the result.

nums = [100, 4, 200, 1, 3, 2]:

Initialize variables:

nums = [100, 4, 200, 1, 3, 2]
longestStreak = 1
currentStreak = 1
Sort the array:

nums = [1, 2, 3, 4, 100, 200]
Start iterating through the sorted array from index 1:

Iteration 1: nums[i] = 2, nums[i - 1] = 1

Since nums[i] is consecutive to nums[i - 1], currentStreak becomes 2.
Iteration 2: nums[i] = 3, nums[i - 1] = 2

Since nums[i] is consecutive to nums[i - 1], currentStreak becomes 3.
Iteration 3: nums[i] = 4, nums[i - 1] = 3

Since nums[i] is consecutive to nums[i - 1], currentStreak becomes 4.
Iteration 4: nums[i] = 100, nums[i - 1] = 4

Since nums[i] is not consecutive to nums[i - 1], longestStreak is updated to 4, and currentStreak is reset to 1.
Iteration 5: nums[i] = 200, nums[i - 1] = 100

Since nums[i] is not consecutive to nums[i - 1], longestStreak remains 4, and currentStreak is reset to 1.
Loop ends, return longestStreak, which is 4.

So, the longest consecutive elements sequence in the array [100, 4, 200, 1, 3, 2] is [1, 2, 3, 4], and its length is 4.




*/