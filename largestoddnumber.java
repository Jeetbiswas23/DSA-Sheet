package StriverDSA;

class Solution {
    public String largestOddNumber(String num) {
        StringBuilder s1 = new StringBuilder();
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            char digit = num.charAt(i);
            if (digit % 2 != 0) {
                s1.append(num.substring(0, i + 1));
                break;
            }
        }
        return s1.toString();
    }
}
/*Approach:

We're tasked with finding the largest odd number from the input string num.
To do this, we iterate through the characters of num from right to left.
As soon as we encounter an odd digit, we append all digits from the left end of num up to the current position (inclusive) to our result.
We then return this result as the largest odd number.
Algorithm:

Initialize an empty StringBuilder named s1 to store the result.
Get the length of the input string num and store it in variable n.
Iterate through the characters of num from right to left using a loop with index i starting from n - 1 down to 0.
Within the loop:
Retrieve the character at the current position i and store it in variable digit.
Check if digit is odd by taking its modulus with 2 (digit % 2 != 0).
If digit is odd:
Append the substring of num from index 0 to i (inclusive) to s1.
Break out of the loop since we've found the largest odd number.
Return the resulting string from s1.
Dry Run:
Let's dry run the code with an example input string "1234567890".

Input string num: "1234567890".
Length of num (n): 10.
Start the loop from index i = 9 to 0:
At i = 9, digit = '0', which is even, so continue.
At i = 8, digit = '9', which is odd.
Append the substring of num from index 0 to 8 (inclusive) to s1: "123456789".
Break out of the loop.
Return "123456789", which is the largest odd number from the input string "1234567890". */
