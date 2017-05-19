/*

387. First Unique Character in a String

Description:

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

*/

public class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        int val = 0;
		for(char c:s.toCharArray()){
			arr[c-'a']++;
		}
		for(int i=0;i<s.length();i++){
			val =s.charAt(i)-97;
			if(arr[val]==1){
				return i;
			}
		}
		return -1;
    }
}
