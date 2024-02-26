package StriverDSA;

class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums, 0, nums.length - 1);
    }

    public int mergesort(int[] nums, int start, int end) {
        if (start >= end) {
            return 0;
        }
        
        int mid = start + (end - start) / 2;
        int count = 0;
        
        count += mergesort(nums, start, mid); // Left Sorted
        count += mergesort(nums, mid + 1, end); // Right Sorted
        count += merge(nums, start, end, mid);

        return count;
    }

    public int merge(int[] nums, int start, int end, int mid) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int count = 0;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if ((long) nums[i] > 2 * (long) nums[j]) {
                count += mid - i + 1;
                j++;
            } else {
                i++;
            }
        }

        i = start;
        j = mid + 1;
        k = 0;

        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= end) {
            temp[k++] = nums[j++];
        }

        for (k = 0, i = start; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
        
        return count;
    }
}

/*Let's take the array: nums = {3, 2, 1, 4, 5}.

Initial Call:
We start with the initial call to reversePairs(nums), which calls mergesort(nums, 0, 4).

Mergesort Function:
Call 1: mergesort(nums, 0, 4)
start = 0, end = 4
Calculate mid = (0 + 4) / 2 = 2.
Recursively call mergesort(nums, 0, 2) and mergesort(nums, 3, 4).
Call 2: mergesort(nums, 0, 2)
start = 0, end = 2
Calculate mid = (0 + 2) / 2 = 1.
Recursively call mergesort(nums, 0, 1) and mergesort(nums, 2, 2).
Call 3: mergesort(nums, 0, 1)
start = 0, end = 1
Calculate mid = (0 + 1) / 2 = 0.
Since start < end, continue dividing.
Recursively call mergesort(nums, 0, 0) and mergesort(nums, 1, 1).
Call 4: mergesort(nums, 0, 0)
start = 0, end = 0
Base case reached (start >= end), return.
No operation performed.
Call 5: mergesort(nums, 1, 1)
start = 1, end = 1
Base case reached (start >= end), return.
No operation performed.
Back to Call 3:
Both left and right subarrays are sorted.
Call merge(nums, 0, 1, 0).
Call 6: merge(nums, 0, 1, 0)
start = 0, end = 1, mid = 0
Compare elements and merge the subarrays {3} and {2} into {2, 3}.
Back to Call 2:
Both left and right subarrays are sorted.
Call merge(nums, 0, 2, 1).
Call 7: merge(nums, 0, 2, 1)
start = 0, end = 2, mid = 1
Compare elements and merge the subarrays {2, 3} and {1} into {1, 2, 3}.
Back to Call 1:
The left subarray {1, 2, 3} is sorted, and the right subarray {4, 5} is sorted.
Call merge(nums, 0, 4, 2).
Call 8: merge(nums, 0, 4, 2)
start = 0, end = 4, mid = 2
Compare elements and merge the subarrays {1, 2, 3} and {4, 5} into {1, 2, 3, 4, 5}.
Final Result:
The sorted array is {1, 2, 3, 4, 5}.
During the merging process, the count of reverse pairs is calculated. */