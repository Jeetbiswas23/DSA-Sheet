package StriverDSA;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCo = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCo = Math.max(maxCo, count);
        }
        return maxCo;

    }
}
/*Initialize two integer variables count and maxCo to zero. count will keep track of the current consecutive count of ones, and maxCo will store the maximum count of consecutive ones encountered so far.

Iterate through the array nums using a for loop.

For each element in the array, check if it is equal to 1.

If the element is equal to 1, increment the count variable (indicating that another consecutive one has been encountered).
If the element is not equal to 1 (meaning it's not a one), reset count to zero (since the consecutive sequence of ones has been broken).
Update the maxCo variable using Math.max function to keep track of the maximum consecutive ones encountered so far. This ensures that maxCo always stores the maximum count of consecutive ones.

After iterating through the entire array, return the value stored in maxCo, which represents the maximum number of consecutive ones found in the array.

Let's say we have the input array: nums = [1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1]

Initialize variables:

count = 0
maxCo = 0
Start iterating through the array:

Index 0: nums[0] = 1
Increment count to 1.
Update maxCo to 1 (since it's the first consecutive one encountered).
Index 1: nums[1] = 1
Increment count to 2.
Update maxCo to 2.
Index 2: nums[2] = 0
Reset count to 0 (since the consecutive sequence of ones has been broken).
Index 3: nums[3] = 1
Increment count to 1.
Update maxCo to 2 (since it's not greater than the current max).
Index 4: nums[4] = 1
Increment count to 2.
Update maxCo to 2 (since it's not greater than the current max).
Index 5: nums[5] = 1
Increment count to 3.
Update maxCo to 3 (since it's greater than the current max).
Index 6: nums[6] = 0
Reset count to 0.
Index 7: nums[7] = 1
Increment count to 1.
Update maxCo to 3 (since it's not greater than the current max).
Index 8: nums[8] = 1
Increment count to 2.
Update maxCo to 3 (since it's not greater than the current max).
Index 9: nums[9] = 1
Increment count to 3.
Update maxCo to 3 (since it's not greater than the current max).
Index 10: nums[10] = 1
Increment count to 4.
Update maxCo to 4 (since it's greater than the current max).
After iterating through the array, return maxCo, which is 4.

So, the maximum number of consecutive ones in the array [1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1] is 4.




 */
