package Arrays;

import java.util.*;

public class TrappedRainWater {
    public static int TrappedRainWater(int height[]) {
        int n = height.length;
        //Calculate  Maximum LeftMax Boundary
        int LeftMax[] = new int[n];
        LeftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            LeftMax[i] = Math.max(height[i], LeftMax[i - 1]);
        }

        //Calculate  Maximum Right Max Boundary
        int RigthMax[] = new int[n];
        RigthMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RigthMax[i] = Math.max(height[i], RigthMax[i + 1]);
        }
        //Loop
        int TrappedWater = 0;
        for (int i = 0; i < n; i++) {
            //Water Level = Minimum(LeftMax Boundary,Right Max Boundary)
            int WaterLevel = Math.min(LeftMax[i], RigthMax[i]);
            //TrappedWaterLevel = WaterLevel-height[i]
            TrappedWater = TrappedWater + WaterLevel - height[i];

        }
        return TrappedWater;

    }

    public static void main(String args[]) {
        int height[] = { 5,2,3,0,2,4 };
        System.out.println(TrappedRainWater(height));
    }

}
/*

"DRY RUN"

Initialize an integer n to the length of the height array, which is 6.

Calculate the maximum height to the left of each building (inclusive of the building itself):

a. Initialize the LeftMax array and set LeftMax[0] to height[0], so LeftMax[0] = 4.

b. For i = 1:
 - `LeftMax[1]` is the maximum of `height[1]` (which is `2`) and `LeftMax[0]` (which is `4`), so `LeftMax[1] = 4`.
Continue this for each index:
 - `LeftMax[2]` is 4.
 - `LeftMax[3]` is 4.
 - `LeftMax[4]` is 4.
 - `LeftMax[5]` is 5.
Calculate the maximum height to the right of each building (inclusive of the building itself):

a. Initialize the RigthMax array and set RigthMax[5] to height[5], so RigthMax[5] = 5.

b. For i = 4:
 - `RigthMax[4]` is the maximum of `height[4]` (which is `2`) and `RigthMax[5]` (which is `5`), so `RigthMax[4] = 5`.
Continue this for each index:

 - `RigthMax[3]` is 5.
 - `RigthMax[2]` is 5.
 - `RigthMax[1]` is 5.
 - `RigthMax[0]` is 4.
Calculate trapped water for each building:

a. For i = 0:
 - Water level will be the minimum of `LeftMax[0]` (4) and `RigthMax[0]` (4), which is `4`. The trapped water at `i = 0` is `4 - height[0]` = 0.
 For i = 1:
  - Water level is the minimum of `LeftMax[1]` (4) and `RigthMax[1]` (5), which is `4`. The trapped water at `i = 1` is `4 - height[1]` = 2.
.. (Continue this for each index)

Sum up all the trapped water. For the given array, the total trapped water is 0 + 2 + 4 + 1 + 2 + 0 = 9.

The function then returns 9 and the main method prints: 9.

Explanation:

The logic is to precompute two arrays - one for the highest building to the left of every building, and one for the highest building to the right. The minimum of these two values for any building minus the height of the building itself gives the amount of rainwater that building can trap. The sum of these values across all buildings gives the total trapped rainwater.




 */
