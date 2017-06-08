/*

415. Add Strings

Description: Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.

*/

public class Solution {
    public String addStrings(String num1, String num2) {
        String ans = "";
		int sum = 0, carry = 0;
		for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {
			if (i >= 0)
				sum = num1.charAt(i) - '0';
			if (j >= 0)
				sum += num2.charAt(j) - '0';
			sum += carry;
			if (sum >= 10) {
				carry = sum / 10;
				sum = sum % 10;
				ans = sum + ans;
			} else {
				carry = 0;
				ans = sum + ans;
			}
			sum = 0;
		}
		return (carry>0) ? carry + ans : ans; 
    }
}