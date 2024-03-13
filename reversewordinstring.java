package StriverDSA;

class Solution {
    public String reverseWords(String s) {
        String[] s2 = s.split("\\s+"); // Corrected regex for splitting by whitespace
        StringBuilder sb = new StringBuilder();
        // Start the loop from the last word
        for (int i = s2.length - 1; i >= 0; i--) { // Corrected loop condition and iteration
            sb.append(s2[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
/*Algorithm:

Split the input string s into an array of words s2 using the split() method with the regular expression "\\s+", which splits the string by one or more whitespace characters.
Initialize a StringBuilder named sb to build the reversed string.
Iterate over the array s2 starting from the last word to the first word.
For each word in s2, append it to the StringBuilder followed by a space.
Finally, return the resulting string obtained from the StringBuilder after trimming any leading or trailing whitespace.
Dry run:
Let's dry run the code with an example input string "Hello World Java ".

Input string s: "Hello World Java ".
Split the input string s into an array of words s2:
s2 = ["Hello", "World", "Java"].
Initialize an empty StringBuilder sb.
Iterate over the array s2 starting from the last word:
For i = 2, append "Java" to sb, followed by a space.
For i = 1, append "World" to sb, followed by a space.
For i = 0, append "Hello" to sb, followed by a space.
The resulting string in sb: "Java World Hello ".
Trim any leading or trailing whitespace from the resulting string: "Java World Hello".
Return the final string "Java World Hello". */