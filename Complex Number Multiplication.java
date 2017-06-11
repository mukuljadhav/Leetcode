/*

537. Complex Number Multiplication

Description: Given two strings representing two complex numbers.

You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

Example 1:
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.

Example 2:
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.

*/

public class Solution {
    public String complexNumberMultiply(String a, String b) {
        int part1 = 0, part2 = 0;
		int plusIndexA = a.indexOf('+');
		int plusIndexB = b.indexOf('+');
        String result = "";
		int a1 = Integer.parseInt(a.substring(0, plusIndexA));
		int a2 = Integer.parseInt(a.substring(plusIndexA + 1, a.length() - 1));

		int b1 = Integer.parseInt(b.substring(0, plusIndexB));
		int b2 = Integer.parseInt(b.substring(plusIndexB + 1, b.length() - 1));

		part1 = a1 * b1 + (a2 * b2 * -1);
		part2 = a1 * b2 + (a2 * b1);
        
        result = Integer.toString(part1) + '+' + Integer.toString(part2) + 'i';
        
        return result;
    }
}