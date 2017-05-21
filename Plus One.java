/*

66. Plus One

Description: Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.

*/

public class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0,count=0;
		for(int i=digits.length-1;i>=0;i--){
			int val = digits[i]+1;
			if(val>=10){
				carry = val / 10;
				digits[i] = 0;
				continue;
			}
			else{
				digits[i] = val;
				carry = 0;
				break;
			}
		}
		if(carry == 1){
			digits = new int[digits.length+1];
			digits[0] = 1;
		}
		return digits;
    }
}

