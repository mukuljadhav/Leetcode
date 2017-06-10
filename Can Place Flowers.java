/*

605. Can Place Flowers

Description: Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False

*/

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(flowerbed.length == 1 && flowerbed[0] == 0) return true;
        if(flowerbed.length == 2 && flowerbed[0] == 0 && flowerbed[1] == 0) 
            return 2 > n;
        for (int i = 1; i < flowerbed.length - 1; i++) {
			if (flowerbed[i] == 0) {
				if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 1) {
					count++;
					flowerbed[i - 1] = 1;
				} else if (flowerbed[i - 1] == 1 && flowerbed[i + 1] == 0) {
					count++;
					flowerbed[i + 1] = 1;
				} else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
					count += 2;
					flowerbed[i - 1] = 1;
					flowerbed[i + 1] = 1;
				}
			} else if (flowerbed[i] == 1 && flowerbed[i + 1] == 1)
				count--;
		}
        return (count >= n) ? true : false;
    }
}