/*

125. Valid Palindrome

Description: Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

*/

public class Solution {
    public boolean isPalindrome(String s) {
        String newstrs = s.replaceAll("[^A-Za-z0-9]+", "");
        if(newstrs.equals("")) return true;
		int low = 0;
		int high = newstrs.length() - 1;
		while (low < high) {
			if (Character.toLowerCase(newstrs.charAt(low)) == Character.toLowerCase(newstrs.charAt(high))) {
				low++;
				high--;
				continue;
			}
			else return false;
		}
		return true;
    }
}