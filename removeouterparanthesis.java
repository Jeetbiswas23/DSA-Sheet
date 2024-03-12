package StriverDSA;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;
        
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
            
            if (balance == 0) {
                result.append(s, start + 1, i);
                start = i + 1;
            }
        }
        
        return result.toString();
    }
}
/*Here's a breakdown of the algorithm:

Initialize a StringBuilder named result to store the resulting string without outer parentheses.
Initialize an integer variable balance to keep track of the balance of parentheses encountered. Positive values indicate more open parentheses, and negative values indicate more closing parentheses.
Initialize an integer variable start to keep track of the starting index of the substring to be appended to the result.
Iterate through each character of the input string s using a for loop.
For each character c:
If c is an opening parenthesis '(', increment the balance by 1.
If c is a closing parenthesis ')', decrement the balance by 1.
Check if the balance becomes zero after this operation. If so, it indicates that the current parenthesis is the outermost one. In this case:
Append the substring of s from index start + 1 to i (inclusive) to the result using the append() method that accepts three parameters.
Update the start index to i + 1 to mark the start of the next substring.
Finally, return the resulting string obtained from the StringBuilder by calling its toString() method.
Here's a dry run example:

Input: s = "(()())(())"

Initial state: result = "", balance = 0, start = 0
Iterate through the characters of the input string s:
For s.charAt(0), '(' is encountered. Increment balance to 1.
For s.charAt(1), '(' is encountered. Increment balance to 2.
For s.charAt(2), ')' is encountered. Decrement balance to 1.
For s.charAt(3), '(' is encountered. Increment balance to 2.
For s.charAt(4), ')' is encountered. Decrement balance to 1.
For s.charAt(5), ')' is encountered. Decrement balance to 0. Here, balance becomes 0, indicating the outermost parenthesis has ended.
Append substring from index start + 1 to i (inclusive) to result. The substring is "(())".
Update start to i + 1, i.e., 6.
For s.charAt(6), '(', Increment balance to 1.
For s.charAt(7), ')', Decrement balance to 0. Here, balance becomes 0 again, indicating the outermost parenthesis has ended.
Append substring from index start + 1 to i (inclusive) to result. The substring is "(())".
Update start to i + 1, i.e., 8.
The loop ends after iterating through all characters of s.
The resulting string obtained from result is "(())()". */