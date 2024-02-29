package StriverDSA;

class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] arr, int st, int en) {
        if (st < en) {
            int mid = st + (en - st) / 2;
            mergeSort(arr, st, mid);
            mergeSort(arr, mid + 1, en);
            merge(arr, st, en, mid);
        }
    }

    public void merge(int[] arr, int st, int en, int mid) {
        int[] temp = new int[en - st + 1];
        int i = st;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= en) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= en) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = st; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}
