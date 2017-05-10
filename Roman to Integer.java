/*

13. Roman to Integer

Description : Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

*/

public class Solution {
    public int romanToInt(String s) {
        int curNo = Integer.MAX_VALUE,prevNo=0,ans=0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'I':
				prevNo=curNo;
				curNo = 1;
				break;
			case 'V':
				prevNo=curNo;
				curNo = 5;
				break;
			case 'X':
				prevNo=curNo;
				curNo = 10;
				break;
			case 'L':
				prevNo=curNo;
				curNo = 50;
				break;
			case 'C':
				prevNo=curNo;
				curNo = 100;
				break;
			case 'D':
				prevNo=curNo;
				curNo = 500;
				break;

			case 'M':
				prevNo=curNo;
				curNo = 1000;
				break;

			}
			ans += curNo;
			if(curNo > prevNo)
				ans -= 2*prevNo;
		}
		return ans;
    }
}