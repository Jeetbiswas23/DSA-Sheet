package StriverDSA;

import java.util.Arrays;

class Solution {
    public static int[] getSecondOrderElements(int n, int[] a) {
        int[] result=new int[2];
        int largest = Integer.MIN_VALUE;
        int secondl=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int seconds=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }if(a[i]<smallest){
                smallest=a[i];
            }
        }    
        for(int i=0;i<a.length;i++){
            if(a[i]!=largest && a[i]>secondl){
                secondl=a[i];
            }
            if(a[i]!=smallest && a[i]<seconds){
                seconds=a[i];
            }

        } 
        result[0]=secondl;
        result[1]=seconds;
        return result;   

    }
}

/*Finding the largest and smallest elements:

largest is initialized to Integer.MIN_VALUE.
smallest is initialized to Integer.MAX_VALUE.
Loop through the array:
For the first element 3: largest becomes 3, smallest becomes 3.
For the second element 1: smallest is still 1.
For the third element 4: largest becomes 4.
For the fourth element 5: largest becomes 5.
For the fifth element 2: smallest becomes 2.
Now, largest = 5 and smallest = 1.

Finding the second largest and second smallest elements:

secondLargest is initialized to Integer.MIN_VALUE.
secondSmallest is initialized to Integer.MAX_VALUE.
Loop through the array:
For the first element 3: secondLargest becomes 3, secondSmallest is unchanged.
For the second element 1: secondSmallest becomes 1.
For the third element 4: secondLargest becomes 4.
For the fourth element 5: secondLargest becomes 4 (since a[i] != largest condition is met).
For the fifth element 2: secondSmallest becomes 2.
Now, secondLargest = 4 and secondSmallest = 2.

Result:

result[0] is set to secondLargest which is 4.
result[1] is set to secondSmallest which is 2.
Therefore, the result for the input array {3, 1, 4, 5, 2} is [4, 2]. */