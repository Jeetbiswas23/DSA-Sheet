package StriverDSA;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int[] result=new int[2];
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if((sum)==target){
                result[0]=start+1;
                result[1]=end+1;
                break;
            }if((sum)>target){
                end--;
            }else{
                start++;
            }
        }
        return result;
        
    }
}
/*Suppose numbers = [2, 7, 11, 15] and target = 9.

Initial Values:

start is initially 0.
end is initially numbers.length - 1, which is 3.
result is an array of size 2, initially filled with zeros.
Iteration 1:

start and end point to the first and last elements of the array: 2 and 15.
Calculate the sum: 2 + 15 = 17 (greater than the target).
Decrement end to move towards a smaller sum.
Iteration 2:

start and end now point to 2 and 11.
Calculate the sum: 2 + 11 = 13 (greater than the target).
Decrement end again.
Iteration 3:

start and end now point to 2 and 7.
Calculate the sum: 2 + 7 = 9 (equal to the target).
Store the indices in the result array: [1, 2] (1-based indices).
Break out of the loop.
Result:

The result array is [1, 2], indicating that the numbers at indices 1 and 2 (7 and 11) add up to the target value of 9.
 */