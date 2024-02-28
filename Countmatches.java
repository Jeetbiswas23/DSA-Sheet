package StriverDSA;

class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        
        while (n > 1) {
            if (n % 2 == 0) {
                matches += n / 2;
                n /= 2;
            } else {
                matches += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        
        return matches;
    }
}

/*Suppose we have n = 7.

Initial State:
n = 7
matches = 0
Iteration 1:
Since n is odd, one team randomly advances, and the rest gets paired.
(n - 1) / 2 = (7 - 1) / 2 = 3. So, 3 matches are played, and 4 teams advance to the next round.
Update matches += 3, n = 4.
Iteration 2:
Since n is even, each team gets paired with another team.
n / 2 = 4 / 2 = 2. So, 2 matches are played, and 2 teams advance to the next round.
Update matches += 2, n = 2.
Iteration 3:
Since n is even, each team gets paired with another team.
n / 2 = 2 / 2 = 1. So, 1 match is played, and 1 team becomes the winner.
Update matches += 1, n = 1.
Final Result:
All matches are played until a winner is decided.
The total number of matches played is matches = 3 + 2 + 1 = 6.
So, for n = 7, the method returns 6, which is the correct output.
 */