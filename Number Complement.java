/*

476. Number Complement

Description: Given a positive integer, output its complement number. 
The complement strategy is to flip the bits of its binary representation.

*/

public class Solution {
    public int findComplement(int num) {
        String binStr = Integer.toBinaryString(num);
		char[] arr = binStr.toCharArray();
		StringBuilder b = new StringBuilder();
		for(char c : arr)
		{
			if(c == '1')
				c = '0';
			else
				c = '1';
			b.append(Character.toString(c));
		}
		return Integer.parseInt(b.toString(), 2);
    }
}