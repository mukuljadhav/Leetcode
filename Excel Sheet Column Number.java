/*

171. Excel Sheet Column Number

Description: Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    
    ...

    Z -> 26
    AA -> 27
    AB -> 28 

*/

public class Solution {
    public int titleToNumber(String s) {
        int len = s.length();
		int val = 0;
		char[] arr = s.toCharArray();
		
		for(int i=0;i<len-1;i++){
			if(i==0)
				val += ((arr[i] - 'A')+1)*26;
			else{
				val += ((arr[i] - 'A')+1);
				val = val * 26;
			}
		}
		val += (arr[len-1]-'A')+1;
		return val;
	
    }
}