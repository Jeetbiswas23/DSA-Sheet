package StriverDSA;

import java.util.*;

class Solution {
    public static int linearSearch(int n, int num, int []arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;

    }
}