package StriverDSA;

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 1; j < n; j++) {
                int nextIndex = (i + j) % n;
                if (nums[nextIndex] < nums[(nextIndex - 1 + n) % n]) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted) {
                return true;
            }
        }
        
        return false;
    }
}
/*The line int nextIndex = (i + j) % n; calculates the next index after rotating the array. Let me break down what this line does:

i is the current index in the outer loop, representing a possible starting point for the rotation.
j is the inner loop index, representing the position relative to the current starting point.
n is the length of the array.
(i + j) % n calculates the effective index after rotation. It sums up the current starting point (i) and the relative position (j). The modulo operator (%) is then used to wrap the index around to stay within the bounds of the array length (n).

This calculation simulates the rotation of the array, ensuring that the index stays within the valid range of array indices. The resulting nextIndex represents the index of the element in the rotated array.

Let's break down the expression nums[(nextIndex - 1 + n) % n]:

(nextIndex - 1 + n): This part is calculating the index of the element immediately before nextIndex. It subtracts 1 from nextIndex to get the previous index and adds n to ensure that the result is non-negative.

% n: The modulo operator is used to wrap the index around within the bounds of the array length n. This is important to handle cases where the subtraction results in a negative value or takes the index beyond the end of the array.

So, the entire expression is used to get the element in the array that is immediately before the current element at nextIndex in a rotated manner. The modulo operation ensures that the index wraps around within the array length. This is useful for checking the order of elements in the rotated array, specifically if the current element is less than the one before it.


The condition if (nums[nextIndex] < nums[(nextIndex - 1 + n) % n]) is checking if the current element in the rotated array (at index nextIndex) is less than the element immediately before it in the rotated array. This comparison is done to verify if the rotated array is sorted in non-decreasing order.

Breaking it down:

nums[nextIndex]: This represents the current element in the rotated array at the index nextIndex.
nums[(nextIndex - 1 + n) % n]: This represents the element immediately before the current element in the rotated array. The (nextIndex - 1 + n) % n expression ensures that the index wraps around to stay within the bounds of the array.
So, the condition is checking whether the current element is less than the element before it in the rotated array. If this condition is true for any pair of elements during the inner loop, it indicates that the array is not sorted in non-decreasing order after rotation, and the isSorted flag is set to false, breaking out of the inner loop.

Now, let's dry run the corrected code with nums = [3,4,5,1,2]:

Outer Loop (i = 0):

Inner Loop (j = 1 to 4):
j = 1, nextIndex = (0 + 1) % 5 = 1
Check: nums[1] (4) >= nums[0] (3) → Condition is true
j = 2, nextIndex = (0 + 2) % 5 = 2
Check: nums[2] (5) >= nums[1] (4) → Condition is true
j = 3, nextIndex = (0 + 3) % 5 = 3
Check: nums[3] (1) >= nums[2] (5) → Condition is false, isSorted = false, break inner loop
Continue outer loop
Outer Loop (i = 1):

Inner Loop (j = 1 to 4):
j = 1, nextIndex = (1 + 1) % 5 = 2
Check: nums[2] (5) >= nums[1] (4) → Condition is true
j = 2, nextIndex = (1 + 2) % 5 = 3
Check: nums[3] (1) >= nums[2] (5) → Condition is true
j = 3, nextIndex = (1 + 3) % 5 = 4
Check: nums[4] (2) >= nums[3] (1) → Condition is false, isSorted = false, break inner loop
Continue outer loop
Outer Loop (i = 2):

Inner Loop (j = 1 to 4):
j = 1, nextIndex = (2 + 1) % 5 = 3
Check: nums[3] (1) >= nums[2] (5) → Condition is false, isSorted = false, break inner loop
Continue outer loop
Outer Loop (i = 3):

Inner Loop (j = 1 to 4):
j = 1, nextIndex = (3 + 1) % 5 = 4
Check: nums[4] (2) >= nums[3] (1) → Condition is true
j = 2, nextIndex = (3 + 2) % 5 = 0
Check: nums[0] (3) >= nums[4] (2) → Condition is true
j = 3, nextIndex = (3 + 3) % 5 = 1
Check: nums[1] (4) >= nums[0] (3) → Condition is true
j = 4, nextIndex = (3 + 4) % 5 = 2
Check: nums[2] (5) >= nums[1] (4) → Condition is true
All conditions are true, isSorted = true, return true
End execution
The corrected dry run shows that the code correctly identifies that the array [3,4,5,1,2] is originally sorted in non-decreasing order and rotated some number of positions. The output is true, which matches the expected result
 */