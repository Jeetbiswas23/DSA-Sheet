package StriverDSA;

import java.util.*;
import java.io.*;

class Solution{

    static int largestElement(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
