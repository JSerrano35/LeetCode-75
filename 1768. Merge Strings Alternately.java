// https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String sol= "";
        // get the longest string and iterate over the bigger one
        if (word1.length() > word2.length()){
            for(int i =0 ; i<word1.length();i++){
                char char1 = word1.charAt(i);
                // add first character
                sol+= char1;
                if(i < word2.length()){
                    // if it exists add the second character
                    char char2 = word2.charAt(i);
                    sol += char2;
                }
            }
        }
        else{
            for(int i =0 ; i<word2.length();i++){
                char char2 = word2.charAt(i);
                if(i < word1.length()){
                    char char1 = word1.charAt(i); 
                    // Add the first if it exists
                    sol += char1;
                }
                // Add teh second
                sol+= char2;
            }
        }
    return sol;
    }
}

/* NOTES:
could be faster if we just append the rest of the word instead of just keep iterating while ignoring the other word
*/ 
