/*

231. Power of Two

Description: Given an integer, write a function to determine if it is a power of two.

*/

public class Solution {
    public boolean isPowerOfTwo(int n) {
        // Using bit manipulation
        int count = 0;
		if(n<0) return false;
		String s = Integer.toBinaryString(n);
		for(int i=0;i<s.length();i++){
			if((s.charAt(i) & 1) == 1)
				++count;
		}
		return (count==1);
    }
}

