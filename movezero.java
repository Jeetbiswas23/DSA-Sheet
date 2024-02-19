package StriverDSA;

class Solution {
    public int[] movezeros(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        return nums;
    }
}


/*Initialization:

index is initialized to 0. It will be used to keep track of the position where the next non-zero element should be placed.
Iterating Through the Array:

The code iterates through the array nums using a for loop, starting from index 0 up to nums.length - 1.
Moving Non-Zero Elements:

For each element nums[i], if it's non-zero (nums[i] != 0), it swaps the element at position i with the element at position index (which is initially 0). This effectively moves the non-zero element to the position index.
After the swap, index is incremented to prepare for the next non-zero element.
Maintaining Relative Order:

By swapping the non-zero elements with the elements at position index, the code maintains the relative order of non-zero elements.
Returning the Modified Array:

Once all non-zero elements are moved to the front of the array, the method returns the modified array nums.
Overall, the code efficiently moves all non-zero elements to the beginning of the array while keeping their relative order intact. The zeroes are automatically placed at the end of the array as a result of this process. */