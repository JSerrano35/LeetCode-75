import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candyCount : candies) {
            if (candyCount > maxCandies) {
                maxCandies = candyCount;
            }
        }

        List<Boolean> result = new ArrayList<>();
        for (int candyCount : candies) {
            int totalWithExtra = candyCount + extraCandies;

            if (totalWithExtra >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}

/*
 * NOTES:
 * Even though we are doing two iterations over the array there is really no other way of getting the max in an array without iterating over it (cause its not organized)
 * That is why this is the best solution and its still just O(n) so its ok
 
 */