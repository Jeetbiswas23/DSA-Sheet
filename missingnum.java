package StriverDSA;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int miss = 0; // Declare and initialize miss outside the loop
        for (int i = 0; i < nums.length; i++) {
            miss += nums[i]; // Calculate sum of all elements in nums
        }
        miss = sum - miss; // Calculate the missing number
        return miss; // Return the missing number
    }
}
/*Initializing Variables:

n is assigned the length of the nums array, which represents the total number of elements.
sum is calculated using the formula for the sum of the first n natural numbers, which will be the sum if all elements from 0 to n were present.
Calculating the Missing Number:

The code iterates through each element of the nums array using a loop.
Inside the loop, it accumulates the sum of all elements of the nums array into the variable miss.
miss now holds the sum of all elements present in the array.
Finding the Missing Number:

Once the loop finishes, the variable miss holds the sum of all elements present in the nums array.
Since we have the expected sum (sum) if all elements were present, subtracting the actual sum (miss) from the expected sum gives us the missing number.
The missing number is then stored back into the variable miss.
Returning the Missing Number:

Finally, the missing number is returned from the function.

Consider the input array nums = [3, 0, 1].

Initialization:

n is assigned the length of nums, which is 3.
sum is calculated using the formula for the sum of the first n natural numbers: sum = 3 * (3 + 1) / 2 = 6.
miss is initialized to 0.
Loop Execution:

Iteration 1: i = 0
miss += nums[0]: miss = 0 + 3 = 3
Iteration 2: i = 1
miss += nums[1]: miss = 3 + 0 = 3
Iteration 3: i = 2
miss += nums[2]: miss = 3 + 1 = 4
Calculating the Missing Number:

Since miss now holds the sum of all elements present in the array, we need to find the missing number.
miss = 4 (sum of elements present in nums).
The expected sum for the array [0, 1, 2, 3] (if no number was missing) is 6.
So, the missing number is 6 - 4 = 2.
Return:

The function returns 2, which is the missing number.
So, the missing number in the array [3, 0, 1] is 2.




*/