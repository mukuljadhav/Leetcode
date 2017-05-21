/*

258. Add Digits

Description:

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:

Could you do it without any loop/recursion in O(1) runtime?

*/

public class Solution {
    public int addDigits(int num) {
        int q = 0,r=0;
        while(num>=10){
            r = num % 10;
            q = num / 10;
            num = r + q;
        }
        return num;
        
        // OR
        
        if(num%9==0 && num != 0)
            return 9;
        return num%9;
        
        // OR
        
        return 1 + (num - 1) % 9;
    }
}