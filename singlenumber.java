package StriverDSA;

class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0; // Reset count for each iteration of i
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {// Here, i != j ensures that we're not comparing the same element with itself
                    count++;
                }
            }
            if (count == 0) {
                return nums[i];
            }
        }
        return -1; // Default return value if no single number is found
    }
}
/*Outer Loop: The outer loop iterates through each element of the input array nums.

for(int i = 0; i < nums.length; i++)
Inner Loop: The inner loop also iterates through each element of the input array nums.

for(int j = 0; j < nums.length; j++)
Comparison: Inside the inner loop, each element at index i is compared with every other element in the array to find duplicates. However, there's an issue with the current implementation, which we'll address shortly.

Duplicate Counting: The code attempts to count the number of occurrences of the element at index i in the array. It increments the count variable whenever a duplicate is found.

if(nums[i] == nums[j]) { count++; }
Handling Non-duplicates: If count remains 0 after checking all elements in the array, it means that no duplicate for the current element nums[i] is found. In this case, the function returns nums[i].

Issue with Current Implementation: The code has a logical error in the way it's counting duplicates. The issue is that it sets count to 0 as soon as it finds a non-duplicate pair. This means it doesn't correctly count the total number of occurrences of the element at index i. It should only reset count after checking all elements in the array.

Return Value: If no single number is found after checking all elements, the code should return a default value. However, this part is missing from the provided code.


Consider the input array: nums = [4, 1, 2, 1, 2]

Here's how the code execution proceeds:

Initialize count = 0.
Start the outer loop with i = 0.
For i = 0, the inner loop starts with j = 1.
Compare nums[0] = 4 with nums[1] = 1. They are not equal, so count is set to 0.
Compare nums[0] = 4 with nums[2] = 2. They are not equal, so count is set to 0.
Compare nums[0] = 4 with nums[3] = 1. They are not equal, so count is set to 0.
Compare nums[0] = 4 with nums[4] = 2. They are not equal, so count is set to 0.
End of inner loop.
Since count is 0, return nums[0] = 4.
End of outer loop.
However, this code is incorrect due to several reasons:

The inner loop should start from j = 0 to compare each element with every other element.
The count variable should not be reset to 0 inside the inner loop. Instead, it should be incremented to count the number of duplicates for each nums[i].
There's an issue with the scope of i when returning the result. The variable i is defined within the outer loop, so it's not accessible outside of it. This will cause a compilation error.*/
