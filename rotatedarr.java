package StriverDSA;

class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int nums[],int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
/*Suppose we have the array nums = [1, 2, 3, 4, 5, 6, 7] and k = 3.

The length of the array nums is 7 and k is 3. So, k = k % n becomes 3 % 7 = 3. So, k remains 3.

First, we call reverse(nums, 0, n-1). This will reverse the entire array.
After this operation, nums becomes: [7, 6, 5, 4, 3, 2, 1].

Then, we call reverse(nums, 0, k-1), which reverses the first k elements of the array.
After this operation, nums becomes: [5, 6, 7, 4, 3, 2, 1].

Finally, we call reverse(nums, k, n-1), which reverses the remaining elements of the array.
After this operation, nums becomes: [5, 6, 7, 1, 2, 3, 4].

So, after the rotation, the array becomes [5, 6, 7, 1, 2, 3, 4].

Variable Initialization:

n stores the length of the array nums.
k represents the number of steps to rotate the array.
Reducing k to Effective Steps:

The line k = k % n; ensures that k is reduced to the effective number of steps needed to rotate the array. This is because if k is greater than or equal to the length of the array (n), rotating by k steps would result in the same array configuration as rotating by k % n steps.
Reversing the Array:

The reverse(nums, 0, n-1) call reverses the entire array. This effectively places the elements in reverse order.
Then, reverse(nums, 0, k-1) is called to reverse the first k elements of the array. This brings the last k elements of the original array to the front.
Finally, reverse(nums, k, n-1) is called to reverse the remaining elements of the array, effectively moving the first (n - k) elements to the end.
The reverse Helper Method:

The reverse method swaps elements symmetrically from the start and end of the specified range until they meet in the middle. This effectively reverses the elements in that range.
By following these steps, the code successfully rotates the array nums to the right by k steps.

Overall, the approach is efficient with a time complexity of O(n), where n is the length of the array. It avoids the need for extra space and performs the rotation in-place.*/