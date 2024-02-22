package StriverDSA;

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length -1;

        while(mid <=high){
            switch(nums[mid]){
                case 0:{
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
/*This Java code implements the Dutch National Flag algorithm to sort an array of colors represented by integers (0, 1, 2) in-place. Here's the logic behind this code:

Initialize three pointers:

low: Points to the region where all elements before it are 0s.
mid: Points to the current element being processed.
high: Points to the region where all elements after it are 2s.
Traverse the array from left to right using the mid pointer until it reaches or crosses the high pointer.

Inside the loop, use a switch statement to handle different cases based on the value of nums[mid]:

If nums[mid] is 0:
Swap nums[low] and nums[mid] to move the current 0 to the low region.
Increment both low and mid pointers to move forward.
If nums[mid] is 1:
Since 1s should remain in the middle, just increment the mid pointer to move forward.
If nums[mid] is 2:
Swap nums[mid] and nums[high] to move the current 2 to the high region.
Decrement the high pointer to move backward.
Repeat this process until the mid pointer crosses the high pointer. At this point, all 0s will be on the left side, all 2s will be on the right side, and 1s will be in the middle.

This algorithm has a time complexity of O(n), where n is the number of elements in the array, as it requires only a single pass through the array to sort it in-place.

nums = [2, 0, 2, 1, 1, 0]
low = 0, mid = 0, high = 5
Iteration 1:

nums[mid] is 2:
Swap nums[mid] and nums[high]: [0, 0, 2, 1, 1, 2]
Decrement high: high = 4
Array: [2, 0, 2, 1, 1, 0]
Iteration 2:

nums[mid] is 0:
Swap nums[low] and nums[mid]: [0, 0, 2, 1, 1, 2]
Increment both low and mid: low = 1, mid = 1
Array: [0, 2, 2, 1, 1, 0]
Iteration 3:

nums[mid] is 2:
Swap nums[mid] and nums[high]: [0, 0, 1, 1, 2, 2]
Decrement high: high = 3
Array: [0, 2, 2, 1, 1, 0]
Iteration 4:

nums[mid] is 1, no action needed.
Increment mid: mid = 2
Array: [0, 2, 2, 1, 1, 0]
Iteration 5:

nums[mid] is 2:
Swap nums[mid] and nums[high]: [0, 0, 1, 1, 2, 2]
Decrement high: high = 2
Array: [0, 1, 2, 1, 2, 0]
Iteration 6:

nums[mid] is 0:
Swap nums[low] and nums[mid]: [0, 0, 1, 1, 2, 2]
Increment both low and mid: low = 2, mid = 3
Array: [0, 1, 2, 1, 2, 0]
Iteration 7:

nums[mid] is 1, no action needed.
Increment mid: mid = 4
Array: [0, 1, 2, 1, 2, 0]
Iteration 8:

nums[mid] is 2:
Swap nums[mid] and nums[high]: [0, 1, 0, 1, 2, 2]
Decrement high: high = 1
Array: [0, 1, 2, 1, 2, 0]
Iteration 9:

nums[mid] is 0:
Swap nums[low] and nums[mid]: [0, 0, 2, 1, 2, 1]
Increment both low and mid: low = 3, mid = 5
Array: [0, 1, 2, 1, 2, 0]
Iteration 10:

mid exceeds high, terminate the loop.
After the loop, the array is sorted as [0, 0, 1, 1, 2, 2], with all 0s on the left, all 1s in the middle, and all 2s on the right.




*/