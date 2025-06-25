// https://leetcode.com/problems/can-place-flowers/description/?source=submission-ac
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        //edge cases
        if(n ==0){
            return true;
        }
        else if(flowerbed.length == 0){
            return false;
        }
        else if (flowerbed.length ==1){
            if (flowerbed[0]==0 && n ==1){
                return true;
            }
            else{
                return false;
            }
        }
        else if (flowerbed.length == 2){
            if (flowerbed[0]==0 && flowerbed[1]==0 && n ==1){
                return true;
            }
            else{
                return false;
            }
        }
        for (int i = 0, j =1, k =2; i < flowerbed.length-2; i++,j++,k++)  {
            // check corner cases where just 00 is enough
            if(i == 0 && flowerbed[i] == 0 && flowerbed[j] ==0 ){
                flowerbed[i] = 1;
                count++;
            }
            // Check for the actual pattern of 000 appearing anywhere else
            else{
                if(flowerbed[i]==0 && flowerbed[j]==0 && flowerbed[k]== 0){
                    flowerbed[j]=1;
                    count++;
                }
            }
            // the other corner case
            if (k == flowerbed.length -1 && flowerbed[j] == 0&& flowerbed[k] == 0){
                flowerbed[k] = 1;
                count++;
            }

            if(count >= n){
                return true;
            }
        }
     return false;
    }
}

/*
 * Notes:
 * -edge cases seem rough, maybe there is a way to merging the corner cases from inside the loop with the edge cases so that they work at the same time and use count
 * This is pretty much just a 3 pointer pattern recognition
 */