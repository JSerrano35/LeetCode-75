// https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if they follow the pattern of letters
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // find the length of the GCD using maths
        int len1 = str1.length();
        int len2 = str2.length();

        int gcdLength = gcd(len1, len2);

        // Get the solution from any of the strings based on the length of the GCD
        return str1.substring(0, gcdLength);
    }

    // GCD algo, best to just know it
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

/* NOTES:
 * This solution was with help, try again later on to see if it sticks
 * The main idea is to use math theorems to apply them to this new example
 */