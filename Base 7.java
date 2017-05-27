/*

504. Base 7

Description: Given an integer, return its base 7 string representation.

Example 1:

Input: 100
Output: "202"

Example 2:

Input: -7
Output: "-10"

*/

public class Solution {
    public String convertToBase7(int num) {
        boolean negative = false;
        StringBuilder sb = new StringBuilder();
        if(num == 0) return "0";
		int rem = 0;
		if (num < 0) {
			negative = true;
			num = Math.abs(num);
		}
		while (num > 0) {
			rem = num % 7;
			sb.append(rem);
			num = num / 7;
		}
		if (negative)
			return "-" + sb.reverse().toString();
		
		return sb.reverse().toString();
    }
}