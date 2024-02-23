package StriverDSA;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n / 2];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos[k] = nums[i];
                k++;
            }
        }
        int[] neg = new int[n / 2];
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg[l] = nums[i];
                l++;
            }
        }
        int[] reg = new int[n];
        int g = 0;
        for (int i = 0; i < k || i < l; i++) {
            if (i < k) {
                reg[g] = pos[i];
                g++;
            }
            if (i < l) {
                reg[g] = neg[i];
                g++;
            }
        }
        return reg;
    }
}
/*Here's a breakdown of the approach:

Create Arrays for Positive and Negative Elements:

Two arrays, pos and neg, are created to store positive and negative elements respectively. Both arrays have a length of n / 2, where n is the length of the nums array.
Initialize counters k and l to keep track of the number of positive and negative elements respectively.
Iterate Through nums Array:

In the first loop, iterate through the nums array to identify positive elements (nums[i] > 0) and store them in the pos array.
Increment k after adding each positive element to pos.
Iterate Through nums Array Again:

In the second loop, iterate through the nums array again to identify negative elements (nums[i] < 0) and store them in the neg array.
Increment l after adding each negative element to neg.
Combine Positive and Negative Elements:

Create a new array reg with the same length as the original nums array to hold the rearranged elements.
Use a loop to combine elements from the pos and neg arrays into the reg array. Iterate until either the end of the pos array (k) or the end of the neg array (l).
This loop ensures that the order of positive and negative elements is preserved in the reg array.
Return the Rearranged Array:

Return the reg array containing the rearranged elements.

nums = [3, -2, 4, -5, 1]
Initialization:

n = 5
Create arrays pos and neg with a length of n / 2 = 2.
Initialize counters k = 0 and l = 0.
Identify Positive and Negative Elements:

Iterate through nums:

i = 0: nums[0] = 3 > 0, so add 3 to pos, increment k.
i = 1: nums[1] = -2 < 0, so add -2 to neg, increment l.
i = 2: nums[2] = 4 > 0, so add 4 to pos, increment k.
i = 3: nums[3] = -5 < 0, so add -5 to neg, increment l.
i = 4: nums[4] = 1 > 0, so add 1 to pos, increment k.
After the iteration:

pos = [3, 4]
neg = [-2, -5]
Combine Positive and Negative Elements:

Create array reg with a length of n = 5.

Initialize g = 0.

Iterate through pos and neg arrays until either k or l reaches their respective lengths:

i = 0: Add pos[0] = 3 to reg[g], increment g.
i = 1: Add neg[0] = -2 to reg[g], increment g.
i = 2: Add pos[1] = 4 to reg[g], increment g.
i = 3: Add neg[1] = -5 to reg[g], increment g.
After the loop:

reg = [3, -2, 4, -5, 0] (Note: The last element may remain uninitialized or set to default value 0).
Return the Rearranged Array:

Return reg array: [3, -2, 4, -5, 0].
*/