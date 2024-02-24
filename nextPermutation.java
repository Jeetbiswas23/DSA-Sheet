package StriverDSA;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2; // Start from the second last element
        
        // Find the first decreasing element from the right
        for (; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        
        // If such an element is found, find the smallest element greater than nums[i] from the right side
        if (i >= 0) {
            int j = n - 1;
            for (; j >= 0; j--) {
                if (nums[j] > nums[i]) {
                    break;
                }
            }
            swap(nums, i, j); // Swap nums[i] and nums[j]
        }
        
        // Reverse the sub-array from i+1 to the end
        reverse(nums, i + 1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
/*Finding the First Decreasing Element:

The code starts by initializing the variable i to n - 2, where n is the length of the array nums. This is because we start comparing elements from the second last element of the array.
It then iterates backward through the array using a for loop until i becomes less than 0.
In each iteration, it checks if the current element nums[i] is less than the next element nums[i + 1].
If such an element is found, it means we've found the first decreasing element from the right, and the loop breaks. This element will be denoted by index i.
Finding the Smallest Element Greater than nums[i]:

If a decreasing element is found (i >= 0), the code proceeds to find the smallest element greater than nums[i].
It initializes j to n - 1 and iterates backward through the array until j becomes less than 0.
In each iteration, it checks if the current element nums[j] is greater than nums[i].
If such an element is found, it means we've found the element to swap with, and the loop breaks. This element will be denoted by index j.
Swapping the Elements:

If both i and j are valid indices (i.e., i >= 0), it swaps nums[i] with nums[j] using a helper function swap.
Reversing the Sub-array:

After swapping, the code reverses the sub-array starting from i + 1 till the end of the array using a helper function reverse.
This step ensures that the elements to the right of nums[i] are arranged in ascending order, guaranteeing the next lexicographically greater permutation.
Final Result:

After executing the above steps, the array nums will contain the next lexicographically greater permutation.

Suppose we have the input array nums = [1, 3, 2].

Initialization:

n = 3
i = 3 - 2 = 1
Finding the First Decreasing Element:

Start iterating backward:
Iteration 1: i = 1, nums[i] = 3, nums[i + 1] = 2. Since 3 > 2, continue.
Iteration 2: i = 0, nums[i] = 1, nums[i + 1] = 3. Since 1 < 3, break the loop.
Finding the Smallest Element Greater than nums[i]:

i = 0, so we need to find the smallest element greater than nums[0] = 1.
Start iterating backward:
Iteration 1: j = 2, nums[j] = 2. Since 2 > 1, break the loop.
Swapping the Elements:

Swap nums[i] and nums[j]:
After swapping, nums = [2, 3, 1].
Reversing the Sub-array:

Reverse the sub-array from i + 1 to the end:
Reverse [3, 1] to get [1, 3].
After reversing, nums = [2, 1, 3].
*/